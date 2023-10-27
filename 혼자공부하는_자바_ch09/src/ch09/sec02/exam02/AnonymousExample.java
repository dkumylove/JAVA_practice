package ch09.sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		// 익명객체를 사용할 객체 생성
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		System.out.println(anony.getChannel());
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}
				@Override
				public void turnOff() {
					System.out.println("SmarTV를 끕니다.");
				}
			}
		);
	}
}
