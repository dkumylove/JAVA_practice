package ch06.sec04.exam03;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
		//리턴값이 없는 메소드, 매개값을 받아서 gas필드 값을 변경
	}
	
	// 가스가 남아있는가를 확인
	// 비교하는 메소드이므로 boolean이 적격
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;// false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴
		//리턴값이 블린인 메소드로 gas필드값이 0이면 false, 0이아니면 ture 리턴
	}
	
	//자동차가 가스가 있는동안 계속해서 달리는 것을 나타낸다.
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				return;// 메소드 실행종료
			}
		}
		// 리턴값이 없는 메소드로 gas필드값이 0이면 retrun문으로 메소드를 강제종료
	}
	
	
	
	
	
}
