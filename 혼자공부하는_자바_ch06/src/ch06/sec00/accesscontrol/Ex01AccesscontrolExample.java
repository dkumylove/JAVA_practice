package ch06.sec00.accesscontrol;

class A {
	private int a; // a전용 접근제어
	int b; // b 디폴트(패키지레벨)접근제어
	public int c; // 공요
}

public class Ex01AccesscontrolExample {

	public static void main(String[] args) {
		A objA = new A(); //객체생성
		// objA.a = 10; // 현재 연습으로 디폴드로 변경 
					 // 다시 클래스 전용으로 바꾸여 어떻게 되는가?
		objA.b = 20;
		objA.c = 30;		

	}

}
