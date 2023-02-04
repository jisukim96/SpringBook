package com.spring.common;

import java.sql.Connection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client_test1 {

	public static void main(String[] args) {

		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		Connection conn = null;
		
		
		//객체 생성 후 메소드 호출
		JDBCUtil  db = new JDBCUtil();
		conn = JDBCUtil.getConnection();
		
		//객체 생성없이 클래스 이름으로 출력
		conn = JDBCUtil.getConnection();
		
	}

}
