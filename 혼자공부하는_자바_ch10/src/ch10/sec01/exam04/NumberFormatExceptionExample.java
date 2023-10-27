package ch10.sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// 숫자형식의 문자열
		String data1 = "100";   //표기 없으면 10진수
		String data2 = "a100";   // a100 = 16진수
		
		// 문자열을 정수로 변환
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // NumberFormatException 발생
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}
