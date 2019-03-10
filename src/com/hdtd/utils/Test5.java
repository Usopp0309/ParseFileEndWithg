package com.hdtd.utils;

//public class Test5 {
//
//}
//package org.data.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Test5 {

	//数据库连接地址
	private static final String url="jdbc:mysql://localhost:3306/hdtdtest1";
	//用户名密码
	private static final String user="root";
	private static final String pwd="root";

	/***
	 * 数据库查询
	 * @throws ClassNotFoundException 
	 */
	public static void query(String url,String user,String pwd) throws ClassNotFoundException{
		Connection conn=null;
		java.sql.PreparedStatement pst=null;
		ResultSet re=null;
		/*
		 * DBC提供了DatabaseMetaData来封装数据库连接对应的数据库信息，通过Connection的getMetaData方法来获取该对象。
		 * DatabaseMetaData接口通常数据库驱动提供商完成实现，其作用是让用户了解数据库的底层信息。
		 * 使用该接口可以了解数据库底层的实现，便于完成多个数据库的相互切换。
		 */
		 DatabaseMetaData metadata=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, pwd);		
			
//			metadata = conn.getMetaData();
//			System.out.println("数据库已知的用户: "+ metadata.getUserName());   
//	         System.out.println("数据库的系统函数的逗号分隔列表: "+ metadata.getSystemFunctions());   
//	         System.out.println("数据库的时间和日期函数的逗号分隔列表: "+ metadata.getTimeDateFunctions());   
//	         System.out.println("数据库的字符串函数的逗号分隔列表: "+ metadata.getStringFunctions());   
//	         System.out.println("数据库供应商用于 'schema' 的首选术语: "+ metadata.getSchemaTerm());   
//	         System.out.println("数据库URL: " + metadata.getURL());   
//	         System.out.println("是否允许只读:" + metadata.isReadOnly());   
//	         System.out.println("数据库的产品名称:" + metadata.getDatabaseProductName());   
//	         System.out.println("数据库的版本:" + metadata.getDatabaseProductVersion());   
//	         System.out.println("驱动程序的名称:" + metadata.getDriverName());   
//	         System.out.println("驱动程序的版本:" + metadata.getDriverVersion());   
//	         System.out.println("驱动程序的版本:" + metadata.getTableTypes());  
//	         System.out.println("............................................");
//	         pst= conn.prepareStatement("select * from aaa");
//	         
//	         //获取数据库列
//	         re=pst.executeQuery();
//	         //数据库列名
//	         ResultSetMetaData data= re.getMetaData();
//	         //getColumnCount 获取表列个数
//	         for(int i=1;i<=data.getColumnCount();i++){
//	        	 //获取列表 index 从1开始、列名、列类型、列的数据长度
//	        	 System.out.println(data.getColumnName(i)+"\t"+data.getColumnTypeName(i)+"\t"+data.getColumnDisplaySize(i));
//	         }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection(conn, pst, re);
		}   
	}
	

	/**
	 * 关闭数据库链接
	 * @param conn
	 * @param pst
	 * @param re
	 */
	public static void closeConnection(Connection conn,PreparedStatement pst,ResultSet re){
		
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(pst!=null)
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(re!=null)
			try {
				re.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		try {
			query(url, user, pwd);;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

