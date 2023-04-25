package com.myspring.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myspring.biz.board.BoardVO;
import com.myspring.biz.board.impl.BoardDAO;
import com.myspring.biz.user.UserVO;
import com.myspring.biz.user.impl.UserDAO;

public class DispatcherServlet extends HttpServlet { // Front Controller 기능의 클래스로서 Controller 구성 요소 중 가장 중요한 역할 수행

	// Controller에서 가장 중요한 DispatcherServlet 클래스는 유지보수 과정에서 기존의 기능을 수정하거나 새로운 기능을 추가하더라도 수정되지 않는다.
	// 최종적으로 스프링 프레임워크에서 제공하는 DispatcherServlet 클래스를 사용하려면 이렇듯 DispatcherServlet 클래스의 소스는 변경할 필요가 없도록 개발해야 한다.

	private static final long serialVersionUID = 1L;
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;

	public void init() throws ServletException {
		// 서블릿 객체가 생성된 후에 멤버변수를 초기화하기 위해 자동으로 실행
		// HandlerMapping과 ViewResolver 객체 초기화, 이를 이용하여 사용자의 요청 처리
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 클라이언트의 요청 path 정보를 추출한다.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);

		// 2. HandlerMapping을 통해 path에 해당하는 Controller 검색
		Controller ctrl = handlerMapping.getController(path);

		// 3. 검색된 Controller를 실행한다
		// handleRequest() 메소드를 호출하여 요청에 해당하는 로직 처리
		String viewName = ctrl.handleRequest(request, response);

		// 4. ViewResolver를 통해 viewName에 해당하는 화면 검색
		String view = null;
		if (!viewName.contains(".do")) {
			view = viewResolver.getView(viewName);
		} else {
			view = viewName;
		}

		// 5. 검색된 화면으로 이동한다.
		response.sendRedirect(view);

	}

}
