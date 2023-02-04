package com.spring.test;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDTO;
import com.spring.board.BoardService;

public class Client_Test_getboardList {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//������ �����̳ʷκ��� bean�� ȣ�� : BoardService -> �������̽�
		BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO ��ü�� ���� �Ŀ� setter �������� DTO �� �ʵ��� ���� �Է�
		BoardDTO boardDTO = new BoardDTO();

		// List<BoardDTO> ������ �޾ƿ�
		List<BoardDTO> boardList = boardService.getBoardList(boardDTO);
		
		for(BoardDTO board : boardList) {
			System.out.println(board);
		}
				
				
	}

}
