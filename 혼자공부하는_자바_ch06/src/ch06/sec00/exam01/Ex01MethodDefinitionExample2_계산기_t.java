package ch06.sec00.exam01;

import java.util.Scanner;

public class Ex01MethodDefinitionExample2_계산기_t {
	// 자주반복해서 사용하는 코드를 대표이름을 붙여서 
	// 그이름으로 부르기만 하면 그 코드 들이 실행 된다
	//  => 함수라고 부르고, 자바는 모든 함수는 클래스에 속해야 하므로
	//     그 클래스의 함수라는 의미로 메소드라고 부른다
	//     (어떤 역학에 몰입함 배우의 연기를 메소드라 하므로)
	
	// 사칙연산 만들기add  sub mal div
	// 두 정수
	// 변수 result
	static int[] inputNumber() {
		// 배열을 이용해서 변수를 두개 만들기
		int[] number = new int[2];
		Scanner sca = new Scanner(System.in);
		System.out.print("첫번째값입력> ");
		number[0] = sca.nextInt();
		System.out.print("두번째값입력> ");
		number[1] = sca.nextInt(); 
		System.out.println("------------");
		// 배열명은 힙에 저장되어 있는 참조 데이터를 가르키는 주소
		return number;
	}
	
	static int add (int a, int b) {
		return a + b;
	}
		
	static int sub (int a, int b) {
		return a - b;
	}
			
	static int mul (int a, int b) {
		return a * b;
	}
			
	static int div (int a, int b) {
		return  a / b;
	}
	
	// makeCalcResultString(입력숫자배열, 계산결과 배열)=> 계산 결과 문자열을 반환
	public static String makeCalcResultString(int[] number, int[] resultNumber) {
		// 메소드 산술연산 결과를 설명하는 기호상수정의(==선언)
		final int 사친연사의_수 =4;
		final int ADD_OPERATION_RESULT = 0;
		final int SUB_OPERATION_RESULT = 1;
		final int MUL_OPERATION_RESULT = 2;
		final int DIV_OPERATION_RESULT = 3;
		
		String msg = """
				add : $x + $y = $addResult
				sub : $x - $y = $subResult
				mul : $x * $y = $mulResult
				div : $x / $y = $divResult
				""";
		msg = msg.replace("$x","" + number[0])
				 .replace("$y","" + number[1])
				 .replace("$addResult","" + resultNumber[ADD_OPERATION_RESULT])
				 .replace("$subResult","" + resultNumber[SUB_OPERATION_RESULT])
				 .replace("$mulResult","" + resultNumber[MUL_OPERATION_RESULT])
				 .replace("$divResult","" + resultNumber[DIV_OPERATION_RESULT]);
		return msg;
	}
	
	/**
	 * 함수에는 두가지 타입이있다
	 * 리턴값(데이터값)이 잆는 함수= 일반적인 함수
	 * 리턴값이 없는 함수= 명령형 함수
	 * 명령형 함수는 리턴값이 없음을 뜻하는 void를 리턴값으로 표현한다
	 * 
	 */
	
	
	//계산결과 출력 = 명령형함수 = 리턴값이 없음 = 리턴값자리에 void적어줌
	// printCalcResult(출력할 문자열 입력)
	public static void printCalcResult(String CalcResultString){
		System.out.println(CalcResultString);
	}
	
	
	public static void main(String[] args) {
		// 메소드 호출하면 
		// 메소드를 호툴한다(==실행한다)이므로 데이터 값을 리턴
		// 연산자와 같다
		// 연산자는 사실 메소드이다
		// 메소드계의 스타를 연사자라고함
				
		// 키보드로부터 두 수를 입력받는 메소드 호출
		int[] number = inputNumber();
		System.out.println("첫번째값" + number[0]);
		System.out.println("두번째값" + number[1]);
		System.out.println("------------");
		
		// 메소드 산술연산 결과를 설명하는 기호상수정의(==선언)
		final int 사친연사의_수 =4;
		final int ADD_OPERATION_RESULT = 0;
		final int SUB_OPERATION_RESULT = 1;
		final int MUL_OPERATION_RESULT = 2;
		final int DIV_OPERATION_RESULT = 3;
		
		// 입력 받은 두 수를 이용하여 사칙연사 실행
		int[] resultNumber = new int[사친연사의_수];
		resultNumber[ADD_OPERATION_RESULT] = add(number[0], number[1]);
		resultNumber[SUB_OPERATION_RESULT] = sub(number[0], number[1]);
		resultNumber[MUL_OPERATION_RESULT] = mul(number[0], number[1]);
		resultNumber[DIV_OPERATION_RESULT] = div(number[0], number[1]);
	
//		System.out.print("첫번째수> ");
//		int x = sca.nextInt();
//		System.out.print("두번째수> ");
//		int y = sca.nextInt(); 
//		
//		System.out.println("add: " + add(x, y));
//		System.out.println("sub: " + sub(x, y));
//		System.out.println("mul: " + mul(x, y));
//		System.out.println("div: " + div(x, y));
//
//		System.out.println("--------------");
//		
		// 화면에 출력하는 뷰
		// 메시지를 한꺼번에 출력
//		// makeCalcResultString(입력숫자배열, 계산결과 배열)=> 계산 결과 문자열을 반환
		String msg = makeCalcResultString(number, resultNumber) ;
//		String msg = """
//				add : $x + $y = $addResult
//				sub : $x - $y = $subResult
//				mul : $x * $y = $mulResult
//				div : $x / $y = $divResult
//				""";
//		msg =msg .replace("$x","" + number[0])
//				 .replace("$y","" + number[1])
//				 .replace("$addResult","" + resultNumber[ADD_OPERATION_RESULT])
//				 .replace("$subResult","" + resultNumber[SUB_OPERATION_RESULT])
//				 .replace("$mulResult","" + resultNumber[MUL_OPERATION_RESULT])
//				 .replace("$divResult","" + resultNumber[DIV_OPERATION_RESULT]);
		// 계산결과 출력
		// printCalcResult(출력할 문자열 입력)
		// System.out.println(msg);
		printCalcResult(msg);
	}

}
