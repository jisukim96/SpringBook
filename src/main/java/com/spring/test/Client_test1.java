package com.spring.test;

import java.sql.Connection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDTO;
import com.spring.board.BoardService;
import com.spring.common.JDBCUtil;



public class Client_test1 {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		Connection conn = null; 
		
		//객체 생성후 메소드 호출 
		JDBCUtil db = new JDBCUtil(); 		
		conn = db.getConnection();
		
		//객체 생성 없이 클래스 이름으로 호출 
		conn = JDBCUtil.getConnection(); 

		System.out.println("==================================");
		
		//스프링 컨테이너로부터 bean을 호출 : BoardService -> 인터페이스
		BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO 객체를 생성 후에 setter 주입으로 DTO 각 필드의 값을 입력
		BoardDTO boardDTO = new BoardDTO();
		
		//DTO의 setter를 사용해서 각 필드의 값을 할당. : title,writer,content
		boardDTO.setTitle("임시제목10");
		boardDTO.setWriter("홍길동");
		boardDTO.setContent("임시 내용입니다.");
		
		//insertBoard 기능 테스트 완료
		boardService.insertBoard(boardDTO);
		
		//update 기능 테스트
		boardDTO.setTitle("수정된 제목");
		boardDTO.setContent("수정된 내용");
		boardDTO.setSeq(6);		//주의 ! DB (SEQ)에 반드시 존재해야함.
		
		//updateBoard 기능 테스트 완료
		boardService.updateBoard(boardDTO);
		
		
		
	}

}
