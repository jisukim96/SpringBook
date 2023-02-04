package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDTO;
import com.spring.board.BoardService;

public class Client_Test_getBoard {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//������ �����̳ʷκ��� bean�� ȣ�� : BoardService -> �������̽�
				BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO ��ü�� ���� �Ŀ� setter �������� DTO �� �ʵ��� ���� �Է�
		BoardDTO boardDTO = new BoardDTO();

		//�� �󼼺��� : �Ѱ��� ���ڵ常 ��� , 
		boardDTO.setSeq(6);
		
		//getBoard(boardDTO) ==> �������� DTO ������
		BoardDTO dbDTO = boardService.getBoard(boardDTO);
		
		//toString() �����ǵǾ�����. DB���� select�� ���ڵ� ���� ���
		System.out.println(dbDTO);
		
	}

}
