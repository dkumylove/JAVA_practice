package ch07.sec03.exam02;

public class Cat extends Animal {
	// 필드
	
	// 부모클래스 Animal의 필드 kind를 초기화
	// 사용자 정의 기본 생성자 함수명(){ ... } 형식을 기본생성자라고 하고
	// 개발자가 직접 정의했으므로 디폴드 기본생성자가 아니가 사용 정의 기본생성자임
	
	// 생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	// 메소드, 추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}
		
}
