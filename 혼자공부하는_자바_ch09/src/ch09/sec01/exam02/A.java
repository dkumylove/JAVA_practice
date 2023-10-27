package ch09.sec01.exam02;

// 정상적인 보통 클래스 A(바깥 클래스 A)
public class A {
	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// 바깥클래스 A객체가 만들어 지지 않아 static B객체를 만들수 없다
	// 정적 메소드에서 인스턴스 멤버를 사용하려면 인스턴스 멤버의 클래스를 생성하고 사용가능
	// static B field3 = new B();
	// static 공유저장소가 따로 있으므로 나중에 A객체가 참조가능
	static C field4 = new C();
	
	// 정적 메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	
	// 인스턴스 멤버 클래스
	// 클래스 A에서만 사용는 필드
	// 클래스 내부 멤버에 static 사용금지
	class B {
	}
	
	// 정적 멤버 클래스
	// 클래스 A에서만 사용는 필드
	// 클래스 내부 멤버에 인스턴스 + static 사용가능
	static class C {
	}
}
