package com.spring.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")	//Spring Framework�� Bean ��� : userService
public class UserServiceImpl implements UserService {

	// ����Ͻ� ������ ó���ϴ� Ŭ����
	
	@Autowired			//@Autowired ������̼��� Spring Framework�� ���� Bean�� Ÿ���� ã�Ƽ� ����(DI)
	UserDAO userDAO ;	//userDAOŸ���� ã�Ƽ� ����
	
	//userDAO�� Ŭ���� ���� �������丮 �پ��ְ�
	
	@Override
	public UserDTO getUser(UserDTO dto) {

		System.out.println(dto.getId());
		System.out.println(dto.getPassword());
		
		return userDAO.getUser(dto);
	}

}
