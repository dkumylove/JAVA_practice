package ch08.sec02.exam01;

public class Car {
	
	// 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire frontLeftTire = new HankookTrie();
	Tire frontRightTire = new HankookTrie();
	Tire backLeftTire = new HankookTrie();
	Tire backRightTire = new HankookTrie();
	
	// 인터페이스에서 설명된 roll()메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	
	}
}
