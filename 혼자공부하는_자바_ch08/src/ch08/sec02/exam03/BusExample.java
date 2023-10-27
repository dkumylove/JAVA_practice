package ch08.sec02.exam03;

public class BusExample {

	public static void main(String[] args) {
		// 자손 클래스 Bus객체를 생성해서 
		// 인터페이스 Vehicle형의 부모참조변수 vehicle 변수로 참조한다
		Vehicle vehicle = new Bus();
		
		vehicle.start();    // 버스 출발
		vehicle.run();		// 버스 달림
		vehicle.stop();		// 버스 멈춤
		
		// 강제로 버스로 만들어서 
		// 부모에게 자식 객체의 나머지를 참조할 수있도록 한다
		// 강제 타입 변환(DownCasting)
		// 반드시 부모 객체가 참조하던 구현타입과 
		Bus bus = (Bus)vehicle; //vehicle원래 가르키던 bus객체를 의미
		
		// bus의 문을 연다
		bus.openDoor();
		// bus의 문을 닫는다
		bus.closeDoor();
		// 요금을 확인한다
		bus.checkFare();
	}

}
