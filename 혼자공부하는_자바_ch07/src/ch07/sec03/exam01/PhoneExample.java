package ch07.sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();   // 추상클래스이기 때문에 new연산자 사용x
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();			//Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();			//Phone의 메소드

	}

}

