package ch06.sec06.exam04.package2;

import ch06.sec06.exam04.package1.A;

public class C {
	//필드
	A a1 = new A(true);      //o
	//A a2 = new A(1);         //x  default생성자접근불가(컴파일에러)
	//A a3 = new A("문자열");  //x  privathe 생성자 접근 불가(컴파일 에러)

}
