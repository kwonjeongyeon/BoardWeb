package com.myspring.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		// getSignature() �޼ҵ带 �̿��ϸ� Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� �̸��� ����� �� ����
		Object[] args = jp.getArgs();
		// getArgs() �޼ҵ带 ���� ���� ����� Object �迭�� �� �� �־ �޼ҵ� ȣ�⿡ � ������ ����ߴ����� �� �� ����.

//		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ����");
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ARGS ���� : " + args[0].toString());
	}

}
