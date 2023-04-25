package com.myspring.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myspring.biz.user.UserVO;
import com.myspring.biz.user.impl.UserDAO;
import com.myspring.view.controller.Controller;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		// 로그인 처리 소스는 DispatcherServlet의 로그인 처리 기능과 같다
		// 하지만 Controller 인터페이스의 handleRequest() 메소드를 재정의했기 때문에 
		// 이동할 화면 리다이렉트가 아니라 리턴으로 처리

		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		// 2. DB 연동처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);

		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);

		// 3. 화면 네비게이션
		if (user != null) {
			return "getBoardList.do";
		} else {
			return "login";
			// handleRequest() 메소드가 확장자 없는 문자열을 리턴하면 자동으로 '.jsp' 확장자가 붙어서 처리
		}
	}
}
