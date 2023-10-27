package ch07.sec02.exam03;

public class Tire {
	// 필드
	public int maxRotation;			//최대 회전수(타이어수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//타이어 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	// 타이어 교체 시기를 알려주는 역할
	public boolean roll() {
		++accumulatedRotation;		//누적회전수 1씩 증가
		
		// 정상회전일 경우 타이가 정상적으로 타이어 수명이 감소
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " 
		                    + (maxRotation - accumulatedRotation) + "회");
			return true;	// 정상 회전(누적<최대)일 경우 실행
		
		} else {// 타이어 회전수  > 최대 회전수 == 타이어 펑크 
			System.out.println("*** " + location + " Tire 평크 ***");
			return false;	// 펑크(누적=최대)일 경우 실행
		}
		
	}
}
