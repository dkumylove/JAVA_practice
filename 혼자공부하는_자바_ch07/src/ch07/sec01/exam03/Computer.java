package ch07.sec01.exam03;

public class Computer extends Calculator{
	@Override // 실행주석 @ 은 내부적으로 클래스, 따라서 @ 다음에 대문자로 시작함
	double areaCircle(double r ) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return  Math.PI* r * r ; 
	}
}
