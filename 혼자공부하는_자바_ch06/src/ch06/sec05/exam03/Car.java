package ch06.sec05.exam03;

public class Car {
	int speed;    //인스턴스 필드
	
	void run() { //인스턴스 메소드
		System.out.println(speed + "으로 달립니다");
	}
	
	// 엔트리 포이트 시작점, 시작메소드
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60; // 문제없음
		myCar.run();
		//speed = 60; 문제발생
		
	}
}
