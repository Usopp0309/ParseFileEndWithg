package com.hdtd.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("fileUpload")
public class FileUploadUtil {
	
	private String filePath;  
	
//    @Value("#{prop.filePath}")   
    //@Value��ʾȥbeans.xml�ļ�����id="prop"��bean������ͨ��ע��ķ�ʽ��ȡproperties�����ļ��ģ�Ȼ��ȥ��Ӧ�������ļ��ж�ȡkey=filePath�Ķ�Ӧ��valueֵ  
    public void setFilePath(String filePath) {  
        System.out.println(filePath);  
        this.filePath = filePath;  
    }  
    
}
