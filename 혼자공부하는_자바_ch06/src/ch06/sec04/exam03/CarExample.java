package ch06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		// 자동차가 달리는 것을 모델링합니다.
		// 자동차 객체를 만듬
		// 기본 가스량을 주입
		// 현재 자동차 가스 상테를 점검
		// 차를 출발
		// 출발한 차가 가스가 있는 동안 달림
		// 가스가 남아있으면 가스충전 필요없음 출력
		// 가스가 없으면 가스를  주입하세요 출력
		//////////////////////////////////
		
		// 자동차가 달리는 것을 모델링합니다.

		// 1. 자동차 객체를 만듬
		Car myCar = new Car();

		// 2. 기본 가스량을 주입
		myCar.setGas(5); // Car의 setGas()메소드 호출
		
		// 3. 현재 자동차 가스 상테를 점검
		boolean gasState = myCar.isLeftGas();   //Car의 isLeftGas()메소드 호출
		// 4. 차를 출발
		if(gasState) {
			System.out.println("출발합니다.");
			// 5. 출발한 차가 가스가 있는 동안 달림
			myCar.run(); //Car의 run()메소드 호출
		}
		
		// 6. 가스가 남아있으면 가스충전 필요없음 출력
		if(myCar.isLeftGas()) { //Car의 isLeftGas()메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			// 7. 가스가 없으면 가스를  주입하세요 출력
			System.out.println("gas를 주입하세요.");
		}

	}

}
