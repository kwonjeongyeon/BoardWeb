package com.myspring.biz.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void printLog(JoinPoint jp) {
		// JoinPoint ��ü�� ����Ϸ��� �����̽� �޼ҵ� �Ű������� ���� �ϸ� �ȴ�.
		// Ŭ���̾�Ʈ�� ����Ͻ� �޼ҵ带 ȣ���� ��, ������ �����̳ʰ� JoinPoint ��ü �����ؼ� �����̽� �޼ҵ� ȣ���� �� �Ѱ��ش�.
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}

}
