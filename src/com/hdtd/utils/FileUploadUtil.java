package com.hdtd.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("fileUpload")
public class FileUploadUtil {
	
	private String filePath;  
	
//    @Value("#{prop.filePath}")   
    //@Value表示去beans.xml文件中找id="prop"的bean，它是通过注解的方式读取properties配置文件的，然后去相应的配置文件中读取key=filePath的对应的value值  
    public void setFilePath(String filePath) {  
        System.out.println(filePath);  
        this.filePath = filePath;  
    }  
    
}
