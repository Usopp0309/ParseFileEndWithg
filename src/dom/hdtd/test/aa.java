package dom.hdtd.test;

import java.io.File;

import com.hdtd.domain.ACLine;

public class aa {
	public static void main(String[] args) {
//		System.out.println("sdf");
//		File file = new File("gfile/TM.10kV³Ç¾Å513ÏßÂ·_10kV.dx.pic.g.xml");
//		System.out.println(file.getName());;
		Class clazz = ACLine.class;
		System.out.println(clazz.toString());
		System.out.println(clazz.getName());
		System.out.println(clazz.getCanonicalName());
		System.out.println(clazz.getSimpleName());
		
	}
}
