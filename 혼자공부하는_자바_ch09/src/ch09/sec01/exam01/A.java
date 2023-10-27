package ch09.sec01.exam01;

/** 바깥 클래스 **/
public class A {
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	/** 인스턴스 멤버 클래스 **/
	// 데이터 타입으로 new로 만들어서 사용할수 있어야함
	class B {
		// 중첩클래스 B용 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}
		
		// 중첩클래스 B용 필드
		int field1;
		
		// 중첩클래스 B용 정적 필드
		// static int field2;
		
		// 중첩클래스 B용 메소드
		void method1() {
			System.out.println("중첩 클래스 B의 method1 호츨");
		}
		
		// 중첩클래스 B용 정적 메소드
		// static void method2() {}
	}

	/** 정적 멤버 클래스 **/
	// 데이터 타입을 명확하게 보호한다는것
	static class C {
		// 중첩 정적클래스 C용 생성자
		C() {
			System.out.println("C 객체가 생성됨");		
		}
		
		// 중첩 정적클래스 C용 필드
		int field1;
		
		// 중첩 정적클래스 C용 정적 필드
		static int field2;
		
		// 중첩 정적클래스 C용 메소드
		void method1() {
			System.out.println("중첩 정적 클래스 C의 method1 호츨");
		}
		
		// 중첩 정적클래스 C용 정적 메소드
		static void method2() {
			System.out.println("중첩 정적 클래스 C의 정적 method2 호츨");
		}	
	}
	
	// 멤버 메소드의 로컬 클래스
	void method() {
		/** 로컬 클래스 **/
		class D {
			// 로컬 글래스 생성자
			D() {
				System.out.println("D 객체가 생성됨");
			}
			// 로컬클래스 인스턴스 필드
			int field1;
			
			// 로컬 클래스 정적 필드
			// static int field2;
			
			// 로컬 클래스 인스턴스 메소드
			void method1() {
				System.out.println(" 로컬 클래스 D의  method1 호츨");
			}
			
			// 로컬 클래스 정적 메소드
			// static void method2() {}
		}
		
		//로컬 클래스 사용
		D d = new D();
		d.field1 = 3;
		d.method1();
		// d.field2 = 3;
		// d.method2();
		
	}
}
