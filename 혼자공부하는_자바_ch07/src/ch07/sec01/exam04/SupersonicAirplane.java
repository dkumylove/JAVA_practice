package ch07.sec01.exam04;

public class SupersonicAirplane extends Airplane {
	// 상수 정의(static final)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		//초음속모드로 설정되었다면 초음속모드비행
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			// 일반 비행 모드라면 부모 클래스의 fly()메소드를 호출
			super.fly();  // Airplane 객체의 fly()메소드 호출
		}
	}

}
