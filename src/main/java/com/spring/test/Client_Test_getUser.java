package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.users.UserDTO;
import com.spring.users.UserService;

public class Client_Test_getUser {

	public static void main(String[] args) {

		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//스프링 컨테이너로부터 bean을 호출 : BoardService -> 인터페이스
		UserService userService = (UserService) factory.getBean("userService");
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId("admin");
		userDTO.setPassword("1234");
		
		//service 인터페이스 메소드 호출 시 리턴으로 UserDTO를 받아옴
		UserDTO user = userService.getUser(userDTO);
		
		System.out.println(user);

	}

}
