package ch07.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		// 홍길동 학생의 정보를 출력
		// student 클래스는 실재로 name,ssn을 직접 가지고있지 않고
		// 부모클래스를 통해 상속받아 참조하고 있다. 어떤 결과가 나오는지 확인
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);

	}

}
