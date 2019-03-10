package dom.hdtd.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hdtd.domain.CBreaker;
import com.hdtd.mapper.CBreakerMapper;

/*
 *   Dom4j :解析 xml 文档 .  
1.	创建核心类 SAXReader 
2.	获取Document 对象 
3.	获取根元素
4.	获取所有子元素.
5.	获取子元素的属性property

 *   
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CBreakerMapper basicMapper = context.getBean(CBreakerMapper.class);
		//1.	创建核心类 SAXReader
		SAXReader r  = new SAXReader();
		
		File file = new File("gfile/TM.10kV城九513线路_10kV.dx.pic.g.xml");
		String fileName = file.getName();
		
		//2.	获取Document 对象 
		Document doc  = r.read(file);
		
		
		// 3. 获取根元素  
		Element root  = doc.getRootElement();//G
		System.out.println(root.getName());
		
		//4.	获取所有子元素.
		List<Element> elist = root.elements();
		for (Element e : elist) {
			System.out.println("\t"+e.getName());	//Layer
			
			ArrayList<CBreaker> list = new ArrayList<CBreaker>();
			
			// 获取 子标签   
			List<Element> elements = e.elements();
			for (Element entity : elements) {
				if("CBreaker".equals(entity.getName())){
					Map map = new HashMap();
					CBreaker cbreaker = new CBreaker();
					List<Attribute> attributes = entity.attributes();
					for (Attribute attribute : attributes) {
//						System.out.println("\t\t"+attribute.getName()+"\t"+attribute.getValue());
						map.put(attribute.getName(), attribute.getValue());
					}
					BeanUtils.populate(cbreaker, map);
					cbreaker.setFileFrom(fileName);
					list.add(cbreaker);
				}
				
			}
			
			for (CBreaker pojo : list) {
				System.out.println(pojo);
//				basicMapper.insert(pojo);
				basicMapper.insertSelective(pojo);
				
//				basicMapper.savee(pojo);
			}
			System.out.println();
			System.out.println(list.get(0));
			System.out.println();
			
//				basicMapper.insertSelective(list.get(0));
//				basicMapper.savee(pojoo);
		}
		 
	}
}
