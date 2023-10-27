package ch06.sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		//필드값 익기
		System.out.println("제약회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.Speed);
		System.out.println();
		// 필드값 변경
		myCar.Speed = 60;
		System.out.println("수정된 속도 : "+ myCar.Speed);		
		System.out.println("-------------------------------");
		
		/////////////////////////////
		// 객체 생성
		Car myCar1 = new Car();
				
		//필드값 읽기
		System.out.println("제약회사 : " + myCar1.company);
		System.out.println("모델명 : " + myCar1.model);
		System.out.println("색깔 : " + myCar1.color);
		System.out.println("최고속도 : " + myCar1.maxSpeed);
		System.out.println("현재속도 : " + myCar.Speed);
		System.out.println();		
		// 필드값 변경
		myCar1.company ="밴츠";
		myCar1.maxSpeed = 350;		
		myCar1.Speed = 100;
		System.out.println("수정된 제약회사 : " + myCar1.company);
		System.out.println("수정된 최고속도 : " + myCar1.maxSpeed);
		System.out.println("수정된 속도 : "+ myCar1.Speed);	
		
		
	}

}
