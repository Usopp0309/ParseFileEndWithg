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

	//���ݿ����ӵ�ַ
	private static final String url="jdbc:mysql://localhost:3306/hdtdtest1";
	//�û�������
	private static final String user="root";
	private static final String pwd="root";

	/***
	 * ���ݿ��ѯ
	 * @throws ClassNotFoundException 
	 */
	public static void query(String url,String user,String pwd) throws ClassNotFoundException{
		Connection conn=null;
		java.sql.PreparedStatement pst=null;
		ResultSet re=null;
		/*
		 * DBC�ṩ��DatabaseMetaData����װ���ݿ����Ӷ�Ӧ�����ݿ���Ϣ��ͨ��Connection��getMetaData��������ȡ�ö���
		 * DatabaseMetaData�ӿ�ͨ�����ݿ������ṩ�����ʵ�֣������������û��˽����ݿ�ĵײ���Ϣ��
		 * ʹ�øýӿڿ����˽����ݿ�ײ��ʵ�֣�������ɶ�����ݿ���໥�л���
		 */
		 DatabaseMetaData metadata=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, pwd);		
			
//			metadata = conn.getMetaData();
//			System.out.println("���ݿ���֪���û�: "+ metadata.getUserName());   
//	         System.out.println("���ݿ��ϵͳ�����Ķ��ŷָ��б�: "+ metadata.getSystemFunctions());   
//	         System.out.println("���ݿ��ʱ������ں����Ķ��ŷָ��б�: "+ metadata.getTimeDateFunctions());   
//	         System.out.println("���ݿ���ַ��������Ķ��ŷָ��б�: "+ metadata.getStringFunctions());   
//	         System.out.println("���ݿ⹩Ӧ������ 'schema' ����ѡ����: "+ metadata.getSchemaTerm());   
//	         System.out.println("���ݿ�URL: " + metadata.getURL());   
//	         System.out.println("�Ƿ�����ֻ��:" + metadata.isReadOnly());   
//	         System.out.println("���ݿ�Ĳ�Ʒ����:" + metadata.getDatabaseProductName());   
//	         System.out.println("���ݿ�İ汾:" + metadata.getDatabaseProductVersion());   
//	         System.out.println("�������������:" + metadata.getDriverName());   
//	         System.out.println("��������İ汾:" + metadata.getDriverVersion());   
//	         System.out.println("��������İ汾:" + metadata.getTableTypes());  
//	         System.out.println("............................................");
//	         pst= conn.prepareStatement("select * from aaa");
//	         
//	         //��ȡ���ݿ���
//	         re=pst.executeQuery();
//	         //���ݿ�����
//	         ResultSetMetaData data= re.getMetaData();
//	         //getColumnCount ��ȡ���и���
//	         for(int i=1;i<=data.getColumnCount();i++){
//	        	 //��ȡ�б� index ��1��ʼ�������������͡��е����ݳ���
//	        	 System.out.println(data.getColumnName(i)+"\t"+data.getColumnTypeName(i)+"\t"+data.getColumnDisplaySize(i));
//	         }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection(conn, pst, re);
		}   
	}
	

	/**
	 * �ر����ݿ�����
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

