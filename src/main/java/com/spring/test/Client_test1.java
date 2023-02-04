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
		
		//��ü ������ �޼ҵ� ȣ�� 
		JDBCUtil db = new JDBCUtil(); 		
		conn = db.getConnection();
		
		//��ü ���� ���� Ŭ���� �̸����� ȣ�� 
		conn = JDBCUtil.getConnection(); 

		System.out.println("==================================");
		
		//������ �����̳ʷκ��� bean�� ȣ�� : BoardService -> �������̽�
		BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO ��ü�� ���� �Ŀ� setter �������� DTO �� �ʵ��� ���� �Է�
		BoardDTO boardDTO = new BoardDTO();
		
		//DTO�� setter�� ����ؼ� �� �ʵ��� ���� �Ҵ�. : title,writer,content
		boardDTO.setTitle("�ӽ�����10");
		boardDTO.setWriter("ȫ�浿");
		boardDTO.setContent("�ӽ� �����Դϴ�.");
		
		//insertBoard ��� �׽�Ʈ �Ϸ�
		boardService.insertBoard(boardDTO);
		
		//update ��� �׽�Ʈ
		boardDTO.setTitle("������ ����");
		boardDTO.setContent("������ ����");
		boardDTO.setSeq(6);		//���� ! DB (SEQ)�� �ݵ�� �����ؾ���.
		
		//updateBoard ��� �׽�Ʈ �Ϸ�
		boardService.updateBoard(boardDTO);
		
		
		
	}

}
