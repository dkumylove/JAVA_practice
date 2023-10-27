package ch06.sec05.exam04;

public class Singleton {
	// 외부에서 new를 사용하여 객체를 여러개 생성하는 것을 막는다
	// 대신 이미 만들어진 객체를 돌려준
	// 구현방법
	// 1. 클래스 내부에서 정적멤버로 자기자신을 변수로 
	// 2. 생성자는 private로 선어하여 뵈부에서 접근금지
	// 3. 대신 클래스가 클래스로더에서 호출될 때 객체를 한번 생성
	// 4. 외부에서 필요할때마다 생성된 정적 변수를 getInstance() 메소드 호출
	
	private static Singleton singleton = new Singleton();

	private Singleton() {}
	// 외부에서 이객체를 부르기 위한 인터페이스 메소드 생성
	// 이 클래스의 객체가 static이므로 메소도 static이어야한다
	static Singleton getInstance() {
		return singleton;
	}
}
