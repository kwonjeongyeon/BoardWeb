package com.myspring.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	// AroundAdvice�� �ݵ�� ProceedingJoinPoint ��ü�� �Ű������� �޾ƾ� �Ѵ�. (proceed() �޼ҵ� ������
	// ������ JoinPoint ���)
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("[BEFORE] : ����Ͻ� �޼ҵ� ���� ���� ó���� ���� ---");
//		Object returnobj = pjp.proceed();
//		//ProceedingJoinPoint ��ü�� proceed() �޼ҵ带 ���� ����Ͻ� �޼ҵ� ȣ�� ����
//		System.out.println("[AFTER] : ����Ͻ� �޼ҵ� ���� �Ŀ� ó���� ���� ---");
//		return returnobj;

		String method = pjp.getSignature().getName();

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object obj = pjp.proceed();

		stopWatch.stop();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " + stopWatch.getTotalTimeMillis() + "(ms)��");
		return obj;
	}

}
