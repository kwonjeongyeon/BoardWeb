package polymorphism;

//TV클래스들의 최상위 부모로 사용할 TV 인터페이스
//모든 TV가 공통으로 가져야 할 메소드들을 추상 메소드로 선언
public interface TV {

	public void powerOn();

	public void powerOff();

	public void volumeUp();

	public void volumeDown();
	
	//TV 인터페이스에 선언된 추상 메소드들을 모두 재정의
	//인터페이스를 이용하여 모든 TV클래스가 같은 메소드들을 가질 수밖에 없도록 강제

}
