package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.users.UserDTO;
import com.spring.users.UserService;

public class Client_Test_getUser {

	public static void main(String[] args) {

		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//������ �����̳ʷκ��� bean�� ȣ�� : BoardService -> �������̽�
		UserService userService = (UserService) factory.getBean("userService");
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId("admin");
		userDTO.setPassword("1234");
		
		//service �������̽� �޼ҵ� ȣ�� �� �������� UserDTO�� �޾ƿ�
		UserDTO user = userService.getUser(userDTO);
		
		System.out.println(user);

	}

}
