package ch06.sec06.exam05.package2;

import ch06.sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;   //o
		//a.field2 = 1;   //x   default필드 접근불가(컴파일 에러)
		//a.field3 = 1;   //x   private필드 접근불가(컴파일 에러)
		
		a.method1();    //o
		//a.method2();    //x   default필드 접근불가(컴파일 에러)
		//a.method3();    //x   private필드 접근불가(컴파일 에러)
	}
}
