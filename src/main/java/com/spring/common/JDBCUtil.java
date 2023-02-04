package com.spring.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
		//DB�� ���� �����ϴ� Ŭ����
	//1. DB�� �����ϴ� �޼ҵ�
		//static : ��ü �������� Ŭ���� �̸����� �ٷ� ȣ��
	public static Connection getConnection() {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		//String driver = "org.h2.Driver";			//h2 ���� ����̺�
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		//String url = "jdbc:h2:tcp://localhost/~/test";
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"C##HR","1234"); //connection��ü�� return�� ������
			//conn = DriverManager.getConnection(url,"sa",""); 	
			
			System.out.println("DB�� ����Ǿ����ϴ�.");		 //���� �� �Ǹ� �ֿܼ� ��µ� ����. Ȯ�� �� �ּ� ó��
			return conn;
			
		}catch(Exception e) {
			e.printStackTrace();	// ���� ���� �� ���� Ȯ�� 
			System.out.println("DB���ῡ �����Ͽ����ϴ�.");
		}
		return null;	//connection �ȵǸ� null�� ���
	}
	//2. DB������ �����ϴ� �޼ҵ� : Connection, PreparedStatement ��ü�� ����
		//Insert, Update, Delete	�޼ҵ� �����ε� (�޼ҵ� �̸��� ���Ƶ� �Ű����� ���� �޶� ���밡��)
	public static void close (PreparedStatement pstmt, Connection conn) {
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) {	//pstmt��ü�� ���ŵ��� ���� ���¶��
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				pstmt = null;
			}
		}
		if(conn != null) {
			try {
				if(!conn.isClosed()) {
					conn.close();
				//	System.out.println("�� �������ϴ�.");
				}
				}catch(Exception e){
					e.printStackTrace();
					
				}finally {
					conn=null;
				}
			}
	}
	
	//3. DB������ �����ϴ� �޼ҵ� : Connection, PreparedStatement, ResultSet ��ü�� ����
		//Select - select�� ��� ���� ResultSet �ʿ���
	public static void close (ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) {	//pstmt��ü�� ���ŵ��� ���� ���¶��
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				pstmt = null;
			}
		}
		if(rs != null) {
			try {
				if(!rs.isClosed()) {	//rs��ü�� ���ŵ��� ���� ���¶��
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		if(conn != null) {
			try {
				if(!conn.isClosed()) {
					conn.close();
				}
				}catch(Exception e){
					
				}finally {
					conn=null;
				}
			}
	}
	
}
