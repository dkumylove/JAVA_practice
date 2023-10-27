package ch07.sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;  //자동타입변환
		parent.method1();
		parent.method2();   //재정의된 메소드가 호출됨
		//parent.method3();   // 호출 불가능
							  // 부모객체에 없는 내용이무로 예외발생
		

	}

}
