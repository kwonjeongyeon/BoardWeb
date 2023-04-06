package polymorphism;

public class BeanFactory {
	//스프링 설정 파일에 등록된 <bean>객체를 생성하고 관리하는 기본적인 컨테이너 기능만 제공
	//클라이언트의 요청(lookup)에 의해서만 <bean>객체가 생성되는 지연 로딩 방식 사용

	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}

}

//TV를 교체할 때 클라이언트 소스를 수정하지 않고 TV를 교체할 수 있도록 Factory 패턴 적용
// Factory 패턴은 클라이언트에서 사용할 객체 생성을 캡슐화하여 TVUser와 TV 사이를 느슨한 결합 상태로 만들어준다.
//Bean Factory의 getBean() 메소드는 매개변수로 받은 beanName에 해당하는 객체를 생성하여 리턴