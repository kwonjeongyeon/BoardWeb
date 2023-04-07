package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	

	//@Qualifier("apple")  //@Qualifier 어노테이션 : 의존성 주입될 객체의 아이디나 이름 지정 가능
	//@Resource(name="apple") //resource는 name 속성을 사용할 수 있어서 스프링 컨테이너가 해당 이름으로 생성된 객체를 검색하여 의존성 주입 처리
	
	@Autowired
	private Speaker speaker;

	public LgTV() {
		System.out.println("==> LgTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}

	public void volumeUp() {
		//System.out.println("LgTV --- 소리 올린다.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		//System.out.println("LgTV --- 소리 내린다.");
		speaker.volumeDown();
	}

}
