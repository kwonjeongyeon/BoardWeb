package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	

	//@Qualifier("apple")  //@Qualifier ������̼� : ������ ���Ե� ��ü�� ���̵� �̸� ���� ����
	//@Resource(name="apple") //resource�� name �Ӽ��� ����� �� �־ ������ �����̳ʰ� �ش� �̸����� ������ ��ü�� �˻��Ͽ� ������ ���� ó��
	
	@Autowired
	private Speaker speaker;

	public LgTV() {
		System.out.println("==> LgTV ��ü ����");
	}

	public void powerOn() {
		System.out.println("LgTV --- ���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV --- ���� ����.");
	}

	public void volumeUp() {
		//System.out.println("LgTV --- �Ҹ� �ø���.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		//System.out.println("LgTV --- �Ҹ� ������.");
		speaker.volumeDown();
	}

}
