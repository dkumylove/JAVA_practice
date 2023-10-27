package ch06.sec00.exam04;

public class MathApp {

	public static void main(String[] args) {
		// Math객체를생성하기
		// 익숙해지기 위해  Math Objcet = mathObj
		Math mathObj = new Math();
		
		int x = 100;
		int y = 3;
		
		// 덧셈 mathObj의 메소드 실행 결과
		int addResult = mathObj.add( x, y);
		System.out.println( x +"와 "+ y +"의 합은 " + addResult + "입니다");
				
		// 뺄셈 mathObj의 메소드 실행 결과
		int subResult = mathObj.sub( x, y);
		System.out.println( x +"와 "+ y +"의 차은 " + subResult + "입니다");
		
		// 곱셈 mathObj의 메소드 실행 결과
		int mulResult = mathObj.mul( x, y);
		System.out.println( x +"와 "+ y +"의 곱은 " + mulResult + "입니다");
		
		// 나눗셈 mathObj의 메소드 실행 결과
		int divResult = mathObj.div( x, y);
		System.out.println( x +"와 "+ y +"의 나눈값은 " + divResult + "입니다");
		
		// 나머지 mathObj의 메소드 실행 결과
		int restResult = mathObj.rest( x, y);
		System.out.println( x +"와 "+ y +"의 나머지는 " + restResult + "입니다");

	}

}
