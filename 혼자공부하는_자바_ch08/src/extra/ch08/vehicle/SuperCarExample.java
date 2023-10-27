package extra.ch08.vehicle;

public class SuperCarExample {
	
	public static void main(String[] args) {
		// SuperCar 객체를 생성
		SuperCar sc = new SuperCar();
	
		// SuperCar 객체의 기능을 테스트
		sc.startEngine(); // 앤진을 시동 건다 : vechile인터페이스
		sc.run();  // 도로를 달립다 : car인터페이스
		sc.fly();  // 창공을 가로지름 : Plain인터페이스 
		sc.ship(); // 바다위를 떠다님 : Ship인터페이스
		sc.stopEngine();
 	
		System.out.println("객체를 통한 메소드 호출 - fin-");
		
		// 부모클래스 타입으로 참조변수를 만들어 SuperCar객체를 참조하게 하는 경우
		
		Vechicle ve = sc; // 인터페이스형 Vechicle타입만 보임
		ve.startEngine(); // Vechicle타입이 가진 메소드
		ve.stopEngine();
		
		Ship sh = sc;
		sh.ship();
		
		Plain pl = sc;
		pl.fly();
		
		Car ca = sc;
		ca.run();
		/////////////////////////////////////
		
		System.out.println("인터페이스 형식의 부모참조변수로 변환");
		
		// 위의 부모 타입으로부터 다시 자식객체로 만드는 경우
		// 강제 타입 변환 (다운개스팅) 이용
		SuperCar superCar = (SuperCar) ve;
		superCar.startEngine();
		superCar.stopEngine();
		superCar.run();
		superCar.ship();
		superCar.fly();
		
		System.out.println("Vehicle 인터페이스 형식을 "
				+ "다시 SuperCar참조변수로 가리키도록(참조) 하는 경우 -fin-");
		
	}
 	
 	
}
