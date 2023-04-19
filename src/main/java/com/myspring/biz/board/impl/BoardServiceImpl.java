package com.myspring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.biz.board.BoardService;
import com.myspring.biz.board.BoardVO;
//import com.myspring.biz.common.Log4jAdvice;
//import com.myspring.biz.common.LogAdvice;

//@Service("boardService")
public class BoardServiceImpl implements BoardService {

	//@Autowired
	private BoardDAO boardDAO;
	// �����ͺ��̽� ������ ���Ե� ����Ͻ� ���� ó���� ���� BoardDAO Ÿ�� ��ü�� ��������� ������ ����.
	// private LogAdvice log;
	// private Log4jAdvice log;

//	public BoardServiceImpl() {
//		// log = new LogAdvice();
//		log = new Log4jAdvice();
//	}

	public void insertBoard(BoardVO vo) {
		// log.printLog();
		// log.printLogging();

//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
//			//seq �������� 0�̸�, IllegalArgumentException�� ������ �߻����� ���� ó�� �����̽��� ���� ���� Ȯ�� 
//			// �� ��� �۾��� subquery�� ����Ͽ� seq �÷����� �ڵ����� ������Ű�� ������ �Ű����� BoardVO ��ü�� seq �������� �߿����� ����.
//		}
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		// log.printLog();
		// log.printLogging();
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		// log.printLog();
		// log.printLogging();
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		// log.printLog();
		// log.printLogging();
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		// log.printLog();
		// log.printLogging();
		return boardDAO.getBoardList(vo);
	}
}
