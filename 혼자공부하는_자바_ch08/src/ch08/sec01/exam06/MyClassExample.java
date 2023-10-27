package ch08.sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)----------------");
		// 필드로 선언
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		// 생성자의 매개변수로 선언
		MyClass myClass2 = new MyClass(new Audio());

		
		System.out.println("3)----------------");
		// 메소드로
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		// 메소드의 매개변수타입으로
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}
