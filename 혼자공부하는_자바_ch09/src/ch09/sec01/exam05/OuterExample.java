package ch09.sec01.exam05;

public class OuterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		// 내부 클래스 형식은 인스턴스 멤버 클래스
		Outter.Nested nested = outter.new Nested();
		// 내부 변수 내용 출력
		nested.print();
	}

}
