package ch09.sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		
		// 익명객체 멤버를 담고있는 객체 생성
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		// 익명객체의 wake()를 부르면 그안에 포함되어있는 work()도 함께 불림
		anony.field.wake();
		System.out.println("==============");
		
		// 익명 객체 로컬 변수 사용
		// 익명 객체를 호출하는 메소드 이용
		anony.method1();
		System.out.println("==============");
		
		// 익명 객체 매개값 사용
		// 익멱 객체를 메소드의 파라미터(인수, 매개값)로 전달하는겨웅
		anony.method2(
			// 매개값으로 익명 객체 대입
//			class Workr extends Person {	 
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
		
		// 실제구현클래스 student 객체를 참조
		anony.student.wake();
	}
}
