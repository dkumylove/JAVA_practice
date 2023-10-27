package ch06.sec04.exam01;

public class Calculator {
	//명령메소드 = 반환값 필요x
	//전원을 켠다
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//전원을 끈다.
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//기능메소드 반환값이 있을 수 있다
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	//곱하기
	int mul(int x, int y) {
		int result = x * y;
		return result;
	}
	
	//나눗셈(오버로딩) : 메소드의 시그니쳐가 다른 경우
	// 메소드 시크니져에는 메소드 선언중 반환감 안들아감
	double divide(double x, double y) {
		double result = x / y;
		return result;
	}
	int divide(int x, int y) {
		int result = x / y;
		return result;
	}
	
	//나머지
	int mod(int x, int y) {
		return x % y;
	}
}
