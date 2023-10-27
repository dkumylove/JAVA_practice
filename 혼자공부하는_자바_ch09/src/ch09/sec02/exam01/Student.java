package ch09.sec02.exam01;

public class Student extends Person {
	@Override
	void wake() {
		System.out.println("9시에 일어납니다.");
		study();
	}

	private void study() {
		System.out.println("공부를 합니다.");
		
	}
}
