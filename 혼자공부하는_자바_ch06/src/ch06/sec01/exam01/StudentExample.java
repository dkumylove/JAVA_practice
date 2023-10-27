package ch06.sec01.exam01;


public class StudentExample {

	public static void main(String[] args) {
		// new 생성자() : 생성자 클래스와 이름이 같다
		// 생성자는 new 새로운 객체(방)이 만들어 지면
		// 방안에 멤버필드를 초기화하는 작업
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참고합니다");
		// 객체.thSting() : 객체의 간략한 정보와 멤버필드의 내용을 문자열로 출력
		// 간략한 정보는 객제의 유일 색별자 해쉬 문자열을 출력
		// 해쉬문자열은 객체마다 가지는 고유한 문자열
		// 이것을 통해서 각 참조변수가 같은 곳을 가르키는지 
		// 다른객체를 가르키는지 알수 있음
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참고합니다");
		
		// System.out.println(); 객체명만 적으면
		// 객체명.toString()메소드를 호출하는 것과 동일
		System.out.println("s1 객체정보 : " + s1);
		System.out.println("s2 객체정보 : " + s2);
		
	}

}
