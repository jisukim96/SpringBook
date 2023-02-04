package com.spring.users;

public class UserDTO {

	//DTO (VO) : client 에서 넘긴 변수의 값을 담아서 DAO에 전달
	//			DAO에서 DB를 Select한 값을 DTO에 담아서 클라이언트에게 전달
	// 컬럼이름 소문자
	
	private String id;
	private String password;
	private String name;
	private String role;
	
	//기본 생성자
	public UserDTO() {}

	
	//getter / setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	//toString() 재정의 : 객체 자체를 출력시 필드의 값을 출력
	@Override
	public String toString() {
		return "usersDTO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	
	
	
	
	
}
