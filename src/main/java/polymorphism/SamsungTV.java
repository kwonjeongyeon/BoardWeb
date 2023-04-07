package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	// speaker ������ ��������� ������, SonySpeaker ��ü�� �����ϰ� �־�� ��
	private int price;

	public SamsungTV() {
		System.out.println("==> SamsungTV(1) ��ü ����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	//SonySpeaker��ü�� �Ű� ������ �޾Ƽ� ��� ������ ����� speaker �ʱ�ȭ
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	//������ �����ǿ��� �ʱ�ȭ�ؾ� �� ��������� ���� ���̸�, ���� ���� ���� �� ���� ����
	}

	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��---");
	}

	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��---");
	}

	public void powerOn() {
		System.out.println("SamsungTV --- ���� �Ҵ�. (���� : "+price +")");
	}

	public void powerOff() {
		System.out.println("SamsungTV --- ���� ����.");
	}

	public void volumeUp() {
		// System.out.println("SamsungTV --- �Ҹ� �ø���.");
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
		// System.out.println("SamsungTV --- �Ҹ� ������.");
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}
