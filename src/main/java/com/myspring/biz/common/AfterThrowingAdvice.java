package com.myspring.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {

	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		// 바인드 변수 exceptObj는 모든 예외 객체를 바인드할 수 있도록 예외 클래스의 최상위 타입인 Exception으로 선언

		String method = jp.getSignature().getName();

//		System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
//		System.out.println("[예외 처리] " + method + "() 메소드 수행 중 발생된 예외 메시지 : " + exceptObj.getMessage());
		System.out.println(method + "() 메소드 수행 중 예외 발생!");

		if (exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값이 입력되었습니다.");
		} else if (exceptObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if (exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}

}
