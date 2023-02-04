package com.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartController() {
        super();
    }
    //doGet으로 넘어오는 요청을 process()메소드에서 처리하도록 넘김
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
    	process(request,response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request,response);
	}
	
	//doGet,doPost로 넘어오는 클라이언트 요청을 process()메소드에서 한꺼번에 처리
	private void process (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 클라이언트 요청 정보를 추출해야함. path 변수에 할당.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(uri);
		
		if(path.equals("/cart.ca")) {
			System.out.println("cart.ca를 요청했습니다.");
		}else if(path.equals("/cart_add.ca")) {
			System.out.println("cart_add.ca를 요청했습니다.");
		}
		
	}
	
}
