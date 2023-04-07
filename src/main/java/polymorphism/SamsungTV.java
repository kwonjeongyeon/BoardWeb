package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	// speaker 변수를 멤버변수로 가지고, SonySpeaker 객체를 참조하고 있어야 함
	private int price;

	public SamsungTV() {
		System.out.println("==> SamsungTV(1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	//SonySpeaker객체를 매개 변수로 받아서 멤버 변수로 선언된 speaker 초기화
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	//생성자 인젝션에서 초기화해야 할 멤버변수가 여러 개이면, 여러 개의 값을 한 번에 전달
	}

	public void initMethod() {
		System.out.println("객체 초기화 작업 처리---");
	}

	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리---");
	}

	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다. (가격 : "+price +")");
	}

	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}

	public void volumeUp() {
		// System.out.println("SamsungTV --- 소리 올린다.");
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
		// System.out.println("SamsungTV --- 소리 내린다.");
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}
