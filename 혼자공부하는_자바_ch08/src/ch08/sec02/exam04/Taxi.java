package ch08.sec02.exam04;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	@Override
	public void start() {
		System.out.println("택시가 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println("택시가 멈춥니다.");
	}
	

	// 자동 문열기
	public void openDoor() {
		System.out.println("문을 엽니다.");
	}
	
	// 자동 문닫기
	public void closeDoor() {
		System.out.println("문을 닫습니다.");
	}
	
}
