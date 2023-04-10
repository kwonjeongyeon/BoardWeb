package com.myspring.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {

	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		// ���ε� ���� exceptObj�� ��� ���� ��ü�� ���ε��� �� �ֵ��� ���� Ŭ������ �ֻ��� Ÿ���� Exception���� ����

		String method = jp.getSignature().getName();

//		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ���� �߻�");
//		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���� �� �߻��� ���� �޽��� : " + exceptObj.getMessage());
		System.out.println(method + "() �޼ҵ� ���� �� ���� �߻�!");

		if (exceptObj instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�.");
		} else if (exceptObj instanceof NumberFormatException) {
			System.out.println("���� ������ ���� �ƴմϴ�.");
		} else if (exceptObj instanceof Exception) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}

}
