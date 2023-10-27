package ch07.sec02.exam04;

public class Truck extends Vehicle{
	// 필드
	public String model;
	
	// 생성자
	public Truck(String model) {
		this.model= model;
	}
	// 메소드
	@Override
	public void run() {
		System.out.println(model + "트럭이 달립니다.");
	}
	
	public void move() {
		System.out.println(model + "트럭이 짐을 싣습니다.");
		run();
	}
	
	
}
