package ch07.sec03.exam02;

public abstract class Animal {
	// 공통요소만 생성
	// 필드
	public String kind;  //종류
	
	// 생성자
		
	// 메소드
	// 숨쉬기 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	//울음소리 내기 추상메소드
	//함수의 정의가 없고 선언만 있음. 불완전함
	public abstract void sound();
	
}
