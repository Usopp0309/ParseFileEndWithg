package com.hdtd.dao;

import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.hdtd.domain.BasicPojo;

public class GparseXml<T extends BasicPojo> {
	public List<T> parseService(File file,Class<T> clazz) throws Exception{
		
		//��ȡ����
		String className = clazz.getSimpleName();
		
		//1.	���������� SAXReader
		SAXReader r  = new SAXReader();
		
//		File file = new File("gfile/TM.10kV�Ǿ�513��·_10kV.dx.pic.g.xml");
		String fileName = file.getName();
		
		//2.	��ȡDocument ���� 
		Document doc  = r.read(file);
		
		
		// 3. ��ȡ��Ԫ��  
		Element root  = doc.getRootElement();//G
		System.out.println(root.getName());
		
		//4.	��ȡ������Ԫ��.
		ArrayList<T> list = new ArrayList<T>();
		List<Element> elist = root.elements();
		for (Element e : elist) {
			System.out.println("\t"+e.getName());	//Layer
			
			
			// ��ȡ �ӱ�ǩ   
			List<Element> elements = e.elements();
			for (Element entity : elements) {
				if(className.equals(entity.getName())){
					Map map = new HashMap();
//					Class<T> clazz = ;
//					Class <T> entityClass = (Class <T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
//					T t = entityClass.newInstance();
					
					T t = clazz.newInstance();
					List<Attribute> attributes = entity.attributes();
					for (Attribute attribute : attributes) {
//						System.out.println("\t\t"+attribute.getName()+"\t"+attribute.getValue());
						map.put(attribute.getName(), attribute.getValue());
					}
					BeanUtils.populate(t, map);
					t.setFileFrom(fileName);
					list.add(t);
				}
				
			}
			
//			for (T pojo : list) {
//				System.out.println(pojo);
////				basicMapper.insert(pojo);
//				basicMapper.insertSelective(pojo);
//				
////				basicMapper.savee(pojo);
//			}
			
			System.out.println();
			System.out.println();
			
		}
		return list;
	}
}
