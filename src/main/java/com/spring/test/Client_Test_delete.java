package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDTO;
import com.spring.board.BoardService;

public class Client_Test_delete {

	public static void main(String[] args) {

		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//������ �����̳ʷκ��� bean�� ȣ�� : BoardService -> �������̽�
				BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO ��ü�� ���� �Ŀ� setter �������� DTO �� �ʵ��� ���� �Է�
		BoardDTO boardDTO = new BoardDTO();
			
		//deleteBoard() �޼ҵ� �׽�Ʈ
		
		//DTO�� seq�÷��� �� �Ҵ� �� deleteBoard(dto) �޼ҵ� ȣ��
		boardDTO.setSeq(4);
		
		//deleteBoard(boardDTO)
		boardService.deleteBoard(boardDTO);
		
		
	}

}
