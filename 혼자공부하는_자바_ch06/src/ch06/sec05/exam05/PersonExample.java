package ch06.sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";  //ssn이 이미 한번 초기화 되었기때문에 수정 불가
		p1.name = "홍삼원";
		
		
		Person p2 = new Person("USA", "123456-2345671", "Jane");
		
		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
		
	}

}
