package ch07.sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		// 비행기 이륙
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		// 감속
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		// 비행기 착륙
		sa.land();

	}

}
