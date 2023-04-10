package com.myspring.biz.common;

import org.aspectj.lang.JoinPoint;

import com.myspring.biz.user.UserVO;

public class AfterReturningAdvice {
	// ����Ͻ� �޼ҵ尡 ����ǰ� ����, ��� �����͸� ������ �� �����ϴ� �����̽�
	// � �޼ҵ尡 � ���� �����ߴ����� �˾ƾ� ���� ó�� ����� �پ��ϰ� ������ �� ����

	public void afterLog(JoinPoint jp, Object returnobj) {
		// Object : ���ε� ���� , ����Ͻ� �޼ҵ尡 ������ �ᱣ���� ���ε��� �������� ���, � ���� ���ϵ��� �𸣱� ������ Object Ÿ������ ����
		String method = jp.getSignature().getName();

		if (returnobj instanceof UserVO) {
			UserVO user = (UserVO) returnobj;
			if (user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " �α���(Admin)");
			}
		}

//		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ����");
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���ϰ� : " + returnobj.toString());
	}

}
