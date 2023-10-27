package ch02.sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValur3 = byteValue1 + byteValue2 ;    // 컴파일에러
		int intValue1 = byteValue1 + byteValue2 ; 
		System.out.println(intValue1);
		
		char charValue1 = 'A' ;
		char charValue2 = 1 ;
		// char charValue3 = charValue1 + charValue2 ;    //컴파일에러
		int intValue2 = charValue1 + charValue2 ;
		System.out.println("유니코드 =  " + intValue2);
		System.out.println("출력문자 =  " + (char)intValue2);
		
		int intValue3 = 10 ;
		int intValue4 = intValue3/4 ;
		System.out.println(intValue4);

		int intValue5 = 10 ;
		//int intValue6 = 10 / 4.0 ;          //컴파일에러
		double doubleValue = intValue5 / 4.0 ;
		System.out.println(doubleValue);
		
		int x = 1 ;
		int y = 2 ;
		double result = x/y;
		System.out.println("x/y = " + result);
		// 정수형에 일어 나는 나누기는 소수점 이하는 버려짐
		
		// x, y를 강제로 더블형으로 변화해보자
		result = (double) x/ (double) y;
		System.out.println("(double) x/ (dpuble) y = " + result);
		
		
	}

}
