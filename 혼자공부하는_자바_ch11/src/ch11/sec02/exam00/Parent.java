package ch11.sec02.exam00;

public class Parent {
	
	// 필드선언
	private String str1 = "1";
	public String str2 = "2";
	
	// 생성자
	public Parent() {
	}
	
	// 메소드
	private void method1() {
		System.out.println("메소드1입니다.");
	}
	
	public void method2(int n) {
		System.out.println("method2 : " + n );
	}
	
	private void method3() {
		System.out.println("method3");
	}
}
