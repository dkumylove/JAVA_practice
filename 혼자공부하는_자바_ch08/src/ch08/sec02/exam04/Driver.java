package ch08.sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		// vehicle매개 변수가 참조하는 객체가 Bus인지 조사
		// 버스이면 요금을 확인하고 다린다
		if(vehicle instanceof Bus) {
			// Bus 객체일 경우 안전하게 강체 타입 변환
			Bus bus = (Bus) vehicle;
			// Bus 타입으로 강제 타입 변환을 하는 이유
			bus.checkFare();
		}
		vehicle.run();
	}

	public void drive(Taxi taxi) {
		// TODO Auto-generated method stub
		
	}

}
