package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
//Abstract implementation of the ApplicationContext interface. Doesn't mandate the type of storage used for configuration; simply implements common context functionality. Uses the Template Method design pattern, requiring concrete subclasses to implement abstract methods.
//ApplicationContext �������̽��� �߻��� �����Դϴ�. ������ ���Ǵ� ���丮�� ������ ������ �������� �ʰ� �Ϲ����� ���ؽ�Ʈ ��ɸ� �����մϴ�. �߻� �޼ҵ带 �����ϱ� ���� ��ü���� ���� Ŭ������ �ʿ��� ���ø�Ʈ �޼ҵ� ���� ������ ����մϴ�.
import org.springframework.context.support.GenericXmlApplicationContext;
//Convenient application context with built-in XML support. This is a flexible alternative to ClassPathXmlApplicationContext and FileSystemXmlApplicationContext, to be configured via setters, with an eventual AbstractApplicationContext.refresh() call activating the context.
//����� XML �������� ���� �������α׷� ���ؽ�Ʈ. �̴� ClassPathXmlApplicationContext �� FileSystemXmlApplicationContext�� ���� ������ �������, ���������� AbstractApplicationContext.refresh() ȣ��� ���ؽ�Ʈ�� Ȱ��ȭ�մϴ�.
//���� �ý����̳� Ŭ���� ��ο� �ִ� XML ���������� �ε��Ͽ� �����ϴ� �����̳�

public class TVUser {

	public static void main(String[] args) {

//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();

		// SamsungTV�� LgTV�� �޼ҵ� �ñ״�ó�� �ٸ��� ������ TVUser �ڵ带 ��κ� �����ؾ� TV�� ��ü�� �� �ִ�.
		// ���� ���¿����� �� TV Ŭ������ ���� �޼ҵ带 �����Բ� ������ ������ ����.
		// ���� TVUser�� ���� Ŭ���̾�Ʈ ���α׷��� �ϳ��� �ƴ϶� ���� ����� ���������� �� �����, TV��ü ������ ���� ���� ���̴�.

//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

		// <���յ��� ���߱� ���� ������ �̿��ϱ�>
		// ��Ӱ� �޼ҵ� ������(overriding), ����ȯ�� �ʿ�
		// TV �������̽� Ÿ���� ������ SamsungTV ��ü�� �����ϰ� ����
		// ����������ȯ�� �̿��Ͽ� ��ü�� �����ϸ� SamsungTV�� LgTV ��ü�� ������ �� �����ϴ� ��ü�� �����ϸ� �ǹǷ� ��ü�� ����
		// ��ü�� �� �ִ�
		// TVUser�� ���� Ŭ���̾�Ʈ ���α׷��� ������ �ִ��� �ּ����� ��������TV��ü ���� -> ���������� ������

//		BeanFactory factory = new BeanFactory();
////		TV tv = (TV) factory.getBean(args[0]); //1. ����� �Ű������� �������� ������ ���� �߻�
//		TV tv = (TV) factory.getBean("samsung"); // 2. ����Ǵ� TV�� �����ϰ� ���� �� ����� �Ű������� �����Ͽ� ����
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

		// <���յ��� ���߱� ���� ������ ���� �̿��ϱ�>
		// TV��ü�� �����Ͽ� �����ϴ� BeanFactory ������ ��� ���� �� ����
		// TVUser�� ��ü�� �ʿ��ϴٴ� ���� BeanFactory�� ��û, BeanFactory�� Ŭ���̾�Ʈ�� ����� TV��ü�� �����Ͽ� �Ѱ���

		                                                                                                                                                                                                                                                                                                                                                                                                                               
		//------------------------------------------------------------------------------
		// 1. Spring �����̳� ����
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// applicationContext.xml �ε� --> GenericXmlApplicationContext ��ü ���� �� ������ �����̳�
		// ����

		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		// 3. Spring �����̳� ����
		factory.close();
		
		
		//----------------------------------------------------------------------------------
		//1. Spring IoC �����̳ʸ� �����Ѵ�.
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
		
		//3. Spring �����̳ʸ� �����Ѵ�.
//		factory.close();

	}

}
