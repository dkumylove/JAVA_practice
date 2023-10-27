package ch07.sec02.exam03;

public class HankookTire extends Tire{
	// 필드
	
	// 셍상자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	// 다른 내용을 출력하기 위해 재정의한 roll()메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		//누적회전수 1씩 증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankokTire 수명: " 
		                    + (maxRotation - accumulatedRotation) + "회");
			return true;	// 정상 회전(누적<최대)일 경우 실행
		} else {
			System.out.println("*** " + location + " HankokTire 평크 ***");
			return false;	// 펑크(누적=최대)일 경우 실행
		}
	}
}
