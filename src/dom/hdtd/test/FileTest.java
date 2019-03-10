package dom.hdtd.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		File file = new File("gfile/chengde_20180108 - 副本.CIME");
//		new FileInputStreamReader(in)
		BufferedReader br = new BufferedReader(new FileReader("gfile/chengde_20180108 - 副本2.CIME"));
		long q = System.currentTimeMillis();
		
		String line;
		line=br.readLine();
		//1:br.readLine()
		//2:line=br.readLine()
		//3:line != null
		ArrayList list = new ArrayList();
		String type = "";
		while((line=br.readLine())!=null) {
			
			if(line.contains("<") && !line.contains("</")){
				if(line.contains("BaseVoltage")){
					System.out.println("----BaseVoltage");
					type = "BaseVoltage";
				}
				if(line.contains("ControlArea")){
					type="ControlArea";
					System.out.println("==========ControlArea");
				}
				br.readLine();
				br.readLine();
			}
			
			System.out.println(line);
			if(type.equals("BaseVoltage")){
				list.add(line);
			}
			
			if(line.contains("</")){
				System.out.println("结束");
//				break;
			}
		}
		

		System.out.println();
		System.out.println();
		list.remove(list.size()-1);
		list.remove(0);
		System.out.println(list.size());
		for (Object object : list) {
			String valueOf = String.valueOf(object);
			System.out.println(valueOf);
			String[] split = valueOf.split("\t");
//			for (int i = 1; i < split.length; i++) {
//				System.out.println(split[i]);
//			}
		}
		
		br.close();
		long w = System.currentTimeMillis();
//		System.out.println(w-q);
//		String aa = "#	1	112871465677750273	380V	0.3800";
//		String replace = aa.replace("\t", ",");
//		System.out.println(replace);
//		String[] split = aa.split("\t");
//		for (int i = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//		}
		
	}
}
