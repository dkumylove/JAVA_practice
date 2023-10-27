package extra.ch08.vehicle;

// 자동차 비행기 쉽 인터페이스로 부터 인터페이스 상속받는다
public class SuperCar implements Car, Plain, Ship {

	@Override
	public void startEngine() {
		System.out.println("엔진을 가동합니다.");
	}

	@Override
	public void stopEngine() {
		System.out.println("엔진을 멈춥니다.");
	}

	@Override
	public void ship() {
		System.out.println("바다위를 떠다닙니다.");		
	}

	@Override
	public void run() {
		System.out.println("고속도로를 달립니다");		
	}

	@Override
	public void fly() {
		System.out.println("하늘을 납니다.");
	}

}
