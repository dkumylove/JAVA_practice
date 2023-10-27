package exam03_02;

import java.util.Scanner;

public class Exam03_02_09 {

	public static void main(String[] args) {

		// 첫번째 수 : 7.3
		// 두번째 수 : 2.5 ---- 0 또는 0.0 결과 무한대
		//------------------
		// 결과 : 2.92 (or 결과 : 무한대)
		
		// 스캐너로 입력받기
		Scanner sca = new Scanner(System.in) ;
		
		// 입력받을 변수 선언
		System.out.print("첫 번째 수 : " );
		double input1 = Double.parseDouble(sca.nextLine());
		
		System.out.print("두 번째 수 : " );
		double input2 = Double.parseDouble(sca.nextLine());
		
		// 입력된 첫번째 수에 두번째수를 나누기
		// if문으로
		System.out.println("-------------------");
		if ((input2 != 0) || (input2 != 0.0)) {
			System.out.println("결과 : " + (input1 / input2));
		} else {
			System.out.println("결과 : 무한대");
		}
		
	
		//double div = input1 / input2 ;
		//System.out.println("-------------------");
		//System.out.println("결과 : " + div);
		// 결과값 출력
		
		
	}

}
