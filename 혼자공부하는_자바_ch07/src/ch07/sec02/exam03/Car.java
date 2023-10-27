package ch07.sec02.exam03;

public class Car {
	// 필드
	// 오류방지를 위한 상수 사용, 가독성 때문
	final int CAR_TIRE_PROBLEM_FRONT_LEFT = 1;
	final int CAR_TIRE_PROBLEM_FRONT_RIGHT = 2;
	final int CAR_TIRE_PROBLEM_BACK_LEFT = 3;
	final int CAR_TIRE_PROBLEM_BACK_RIGHT = 4;
	
	// 자동차는 4개의 타이어를 가짐
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자
	
	// 메소드
	// 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll()메소드를 호출
	// false를 리턴하는 roll()이 있을 경우 stop()메소드를 호출하고
	// 해당 타이어 번호를 리턴
	int run() {
		System.out.println("[자동차가 달립니다.]");
		// 다중if문을 사용하면 안됨
		// 각 타이어가 독립적으로 움직이기 때문. 동시에 펑크 날수 도 있음
		if(frontLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_LEFT;
		}
		if(frontRightTire.roll() == false){
			stop();
			return CAR_TIRE_PROBLEM_FRONT_RIGHT;
		}
		if(backLeftTire.roll() == false){
			stop();
			return CAR_TIRE_PROBLEM_BACK_LEFT;
		}
		if(backRightTire.roll() == false){
			stop();
			return CAR_TIRE_PROBLEM_BACK_RIGHT;
		}
		return 0;
	}
	
	//펑크 났을때 실행
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
