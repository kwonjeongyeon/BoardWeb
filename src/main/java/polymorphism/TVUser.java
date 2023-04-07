package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
//Abstract implementation of the ApplicationContext interface. Doesn't mandate the type of storage used for configuration; simply implements common context functionality. Uses the Template Method design pattern, requiring concrete subclasses to implement abstract methods.
//ApplicationContext 인터페이스의 추상적 구현입니다. 구성에 사용되는 스토리지 유형을 강제로 지정하지 않고 일반적인 컨텍스트 기능만 구현합니다. 추상 메소드를 구현하기 위해 구체적인 하위 클래스가 필요한 템플리트 메소드 설계 패턴을 사용합니다.
import org.springframework.context.support.GenericXmlApplicationContext;
//Convenient application context with built-in XML support. This is a flexible alternative to ClassPathXmlApplicationContext and FileSystemXmlApplicationContext, to be configured via setters, with an eventual AbstractApplicationContext.refresh() call activating the context.
//내장된 XML 지원으로 편리한 응용프로그램 컨텍스트. 이는 ClassPathXmlApplicationContext 및 FileSystemXmlApplicationContext에 대한 유연한 대안으로, 최종적으로 AbstractApplicationContext.refresh() 호출로 컨텍스트를 활성화합니다.
//파일 시스템이나 클래스 경로에 있는 XML 설정파일을 로딩하여 구동하는 컨테이너

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

		// SamsungTV와 LgTV는 메소드 시그니처가 다르기 때문에 TVUser 코드를 대부분 수정해야 TV를 교체할 수 있다.
		// 현재 상태에서는 두 TV 클래스가 같은 메소드를 가지게끔 강제할 수단이 없다.
		// 만약 TVUser와 같은 클라이언트 프로그램이 하나가 아니라 여러 개라면 유지보수는 더 힘들고, TV교체 결정도 쉽지 않을 것이다.

//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

		// <결합도를 낮추기 위해 다형성 이용하기>
		// 상속과 메소드 재정의(overriding), 형변환이 필요
		// TV 인터페이스 타입의 변수로 SamsungTV 객체를 참조하고 있음
		// 묵시적형변환을 이용하여 객체를 참조하면 SamsungTV를 LgTV 객체로 변경할 때 참조하는 객체만 변경하면 되므로 객체를 쉽게
		// 교체할 수 있다
		// TVUser와 같은 클라이언트 프로그램이 여러개 있더라도 최소한의 수정으로TV교체 가능 -> 유지보수가 편해짐

//		BeanFactory factory = new BeanFactory();
////		TV tv = (TV) factory.getBean(args[0]); //1. 명령행 매개변수를 전달하지 않으면 예외 발생
//		TV tv = (TV) factory.getBean("samsung"); // 2. 실행되는 TV를 변경하고 싶을 땐 명령행 매개변수만 수정하여 실행
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

		// <결합도를 낮추기 위해 디자인 패턴 이용하기>
		// TV객체를 생성하여 리턴하는 BeanFactory 때문에 결과 얻을 수 있음
		// TVUser는 객체가 필요하다는 것을 BeanFactory에 요청, BeanFactory가 클라이언트가 사용할 TV객체를 생성하여 넘겨줌

		                                                                                                                                                                                                                                                                                                                                                                                                                               
		//------------------------------------------------------------------------------
		// 1. Spring 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// applicationContext.xml 로딩 --> GenericXmlApplicationContext 객체 생성 및 스프링 컨테이너
		// 구동

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		// 3. Spring 컨테이너 종료
		factory.close();
		
		
		//----------------------------------------------------------------------------------
		//1. Spring IoC 컨테이너를 구동한다.
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
		
		//3. Spring 컨테이너를 종료한다.
//		factory.close();

	}

}
