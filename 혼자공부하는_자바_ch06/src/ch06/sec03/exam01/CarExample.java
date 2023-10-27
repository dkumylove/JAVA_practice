package ch06.sec03.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		// Car myCar = new Car();  (x)--- 기존 생성자를 호출 할 수 없음
		
		System.out.println("myCar 객체 생성되었습니다.");
		System.out.println("myCar 객체정보 :" + myCar);
		System.out.println("myCar.color :" + myCar.color);
		System.out.println("myCar.cc :" + myCar.cc);
	}

}
