package ch09.sec01.exam01;

public class Main {

	private static Object object;

	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		// A클래스의 B사용자정의타입
		// A.B b : A.B타입의 참조변수 b 선언
		// a.new B() : a참조변수가 가르키는 A타입의 객체 안에 중첩클래스 B의 새로운 서부방 만들기
		A.B b = a.new B();
		
		// 만들어진 객체를 사용
		// b객체의 field1에 3 대입
		b.field1 = 3;
		b.method1();
		
		// 중첩클래스 B의 정적 필드, 의미상으로 안됨
		// 보안상의 문제가 될수 있음
		// A.B.field2 = 100;
		// A.B.method2();
		
		System.out.println("=====================================");
		
		// 정적 멤버 클래스 객체 생성
		// 한번만 정의 함
		// 인스턴스 멤버도 포함하고 있으므로 객체 생성 필요
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		System.out.println("======================================");
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		// a객체의 method() 호출
		a.method();
	}

}
