package ch10.sec02.exam02.th;

public class ThrowsExample {

	public static void main(String[] args) {
		// findClass() 메소드 사용
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} 
	}
	// 실행할 메소드를 정의
	// 발생한 예외처리를 외부로 부탁(던지는)하는 경우
	// throws 예외 종류,.. 구문 사용
	// 반드시 외부에서 t ~ c ~ f 로 처리해야함
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
