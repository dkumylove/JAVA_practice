package ch08.sec02.exam03;


public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// Vehicle 인터페이스에는 checkFare()가 없음
		// vehicle.checkFare(); // 자식인 버스의 메소드
		
		// 강제 타입 변환
		Bus bus = (Bus)vehicle;
		
		// Bus 클래스에는 checkFare()가 있음
		bus.run();
		bus.checkFare();
	}

}
