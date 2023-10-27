package ch09.sec01.exam05;

public class Outter {
	// 바깥 클래스 필드
	String field = "Outter-field";
	// 바깥 클래스 메소드
	void method() {
		System.out.println("Outter-method");
	}
	
	// 중첩클래스
	class Nested {
		// 중첩 클래스 필드
		String field = "Nested-field";
		// 중접 클래스 메소드
		void method() {
			System.out.println("Nested-method");
		}
		
		// 내부 클래스와 외부 클래스 멤버출력
		void print() {
			// 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			
			// 바깥 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
