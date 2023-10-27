package ch10.sec02.exam02.th;

public class ThrowsOtherExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// 예외 처리를 한곳에 집중하게 하거나 JVM이 처리해도 되는 예외일 경우
		// (프로그램을 종료하는데 예외가 발생한다던지)
		findClass();
		
	}
	// 실행할 메소드를 정의
	// 발생한 예외처리를 외부로 부탁(던지는)하는 경우
	// throws 예외 종류,.. 구문 사용
	// 반드시 외부에서 t ~ c ~ f 로 처리해야함
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
