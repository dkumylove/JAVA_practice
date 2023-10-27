package ch07.sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		
		//자동타입변환
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*//불가능
		parent.field2 = "data2";
		parent.method3();
		 */
		
		//강제타입변환
		Child child = (Child) parent;
		child.field1 = "yyy";
		child.method1();
		child.method2();
		child.method3();
	}

}
