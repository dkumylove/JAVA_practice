package ch09.sec02.exam01;

public class Anonymous {
	// 실제 일하는 Person 클래스의 자식클래스 Worker을 정의한다
	// class Worker extends Person  class Worker를 익명클래스
	// 필드 초기값으로 대입
	// 필드값으로 익명 객체 대입
	// field: Person 타입 익명객체를 가리키는 멤버필드
	Person field = new Person() { 
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		// 로컬 변수값으로 대입
		// 로컬 변수값으로 익명 객체 대입
		// class Worker extends Person  class Worker를 익명클래스
		Person localVar = new Person() {
			void work() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				work();
			}
		};
		
		// 로컬 변수 사용
		localVar.wake();
	}
	// 익명객체를 메소드의 매개변수로 전달하는 경우
	// 메소드(익명객체);
	void method2(Person person) {
		// 다형성을 이용한 메소드재정의 실행
		person.wake();
	}
	
	// 실제 클래스를 구현
	Person student = new Student();
	
}
