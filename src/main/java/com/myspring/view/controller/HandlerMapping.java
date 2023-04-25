package com.myspring.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.myspring.view.board.DeleteBoardController;
import com.myspring.view.board.GetBoardController;
import com.myspring.view.board.GetBoardListController;
import com.myspring.view.board.InsertBoardController;
import com.myspring.view.board.UpdateBoardController;
import com.myspring.view.user.LoginController;
import com.myspring.view.user.LogoutController;

public class HandlerMapping {
	// 모든 Controller 객체들을 저장하고 있다가 클라이언트의 요청이 들어오면 특정 Controller를 검색하는 기능 제공

	private Map<String, Controller> mappings;
	// Map 타입의 커렉션을 멤버변수로 가지고 있으면서 게시판 프로그램에 필요한 모든 Controller 객체들을 등록 관리

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}

	public Controller getController(String path) {
		// 매개변수로 받은 path에 해당하는 Controller 객체를 HashMap 컬렉션으로부터 검색하여 리턴
		return mappings.get(path);
	}

}
 