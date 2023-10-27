package ch06.sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// 계산기 객체 생성
		Calculator myCalc = new Calculator();
		
		//전원켜기
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+ result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		//전원끄기
		myCalc.powerOff();
	}

}
