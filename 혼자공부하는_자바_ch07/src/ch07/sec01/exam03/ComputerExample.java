package ch07.sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		// 반지름
		int r = 10;
		
		// 부모클래스가 calculator
		Calculator calculator = new Calculator();
		System.out.println("Calculator원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		// 부모클래스가 computer
		Computer computer = new Computer();  // 재정의된 메소드가 호출
		System.out.println("Computer원면적 : " + computer.areaCircle(r)); 

	}

}
