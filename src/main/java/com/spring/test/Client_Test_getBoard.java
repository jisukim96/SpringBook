package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDTO;
import com.spring.board.BoardService;

public class Client_Test_getBoard {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//스프링 컨테이너로부터 bean을 호출 : BoardService -> 인터페이스
				BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO 객체를 생성 후에 setter 주입으로 DTO 각 필드의 값을 입력
		BoardDTO boardDTO = new BoardDTO();

		//글 상세보기 : 한개의 레코드만 출력 , 
		boardDTO.setSeq(6);
		
		//getBoard(boardDTO) ==> 리턴으로 DTO 가져옴
		BoardDTO dbDTO = boardService.getBoard(boardDTO);
		
		//toString() 재정의되어있음. DB에서 select한 레코드 값을 출력
		System.out.println(dbDTO);
		
	}

}
