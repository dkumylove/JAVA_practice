package ch07.sec02.exam04;

public class DriveExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Truck truck = new Truck("테슬라");
		
		//자동 타입 변환: Vehicle vehicle = Bus;
		driver.drive(bus);
		//자동 타입 변환: Vehicle vehicle = Taxi;
		driver.drive(taxi);
		
		driver.drive(truck);
		
		truck.move();

	}

}
