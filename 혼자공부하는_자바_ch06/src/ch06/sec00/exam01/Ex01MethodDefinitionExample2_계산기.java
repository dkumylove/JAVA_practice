package ch06.sec00.exam01;

import java.util.Scanner;

public class Ex01MethodDefinitionExample2_계산기 {
	// 자주반복해서 사용하는 코드를 대표이름을 붙여서 
	// 그이름으로 부르기만 하면 그 코드 들이 실행 된다
	//  => 함수라고 부르고, 자바는 모든 함수는 클래스에 속해야 하므로
	//     그 클래스의 함수라는 의미로 메소드라고 부른다
	//     (어떤 역학에 몰입함 배우의 연기를 메소드라 하므로)
	

	// 사칙연산 만들기add  sub mal div
	// 두 정수
	// 변수 result
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
		return a / b;
	}

	
	public static void main(String[] args) {
		// 메소드 호출하면 
		// 메소드를 호툴한다(==실행한다)이므로 데이터 값을 리턴
		// 연산자와 같다
		// 연산자는 사실 메소드이다
		// 메소드계의 스타를 연사자라고함

		Scanner sca = new Scanner(System.in);
	
		System.out.print("첫번째수> ");
		int x = sca.nextInt();
		System.out.print("두번째수> ");
		int y = sca.nextInt(); 
	
//		System.out.println("add: " + add(x, y));
//		System.out.println("sub: " + sub(x, y));
//		System.out.println("mul: " + mul(x, y));
//		System.out.println("div: " + div(x, y));

		System.out.println("--------------");
		
		String msg = """
				add : $x + $y = $add
				sub : $x - $y  = $sub
				mul : $x * $y = $mul
				div : $x / $y = $div
				""".replace("$x","" + x)
				   .replace("$y","" + y)
				   .replace("$add","" + add(x,y))
				   .replace("$sub","" + sub(x,y))
				   .replace("$mul","" + mul(x,y))
				   .replace("$div","" + div(x,y));
		System.out.println(msg);		   
	}

}
