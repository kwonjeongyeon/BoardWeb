package com.myspring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.biz.board.BoardService;
import com.myspring.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	//데이터베이스 연동이 포함된 비즈니스 로직 처리를 위해 BoardDAO 타입 객체를 멤버변수로 가지고 있음.

	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
}
