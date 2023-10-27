package exam03_02;

import java.util.Scanner;

public class Exam03_02_09_t {

	public static void main(String[] args) {

		// 첫번째 수 : 7.3
		// 두번째 수 : 2.5 ---- 0 또는 0.0 결과 무한대
		//------------------
		// 결과 : 2.92 (or 결과 : 무한대)
		// 스캐너, next(), if, 형변환
		
		// 키보드입력받을 것이므로 스캐너로 입력받기
		Scanner sca = new Scanner(System.in) ;
		
		// 변수 2개 선언
		//String input1 = sca.nextLine();
		//String input2 = sca.nextLine();
		
		// 형변환
		// double ip1 = Double.parseDouble(input1);
		// double ip2 = Double.parseDouble(input2);
		
		// 위 두개를 한번에
		// double input1 = Double.parseDouble(sca.nextLine());
		// double input2 = Double.parseDouble(sca.nextLine());
		
	
		// 입력받아 출력	
		System.out.print("첫 번째 수 : ");
		double input1 = Double.parseDouble(sca.nextLine());
		System.out.print("두 번째 수 : ");
		double input2 = Double.parseDouble(sca.nextLine());

		System.out.println("-------------------");
		
		// double div = input1 / input2 ;
		// System.out.println("결과 : " + div);
		// 결과값 출력
		
		
		// 입력된 첫번째 수에 두번째수를 나누기
		// if문으로
		// 에러가 발생했을 경우
		// 1. 0또는 0.0 나누었을때 처리
		// 2. 어떤 상황이 일어나면 그 처리를 해라(조건문필요)
		
		// if ( (input2 == 0) || (input2 == 0.0) ) {
		//	System.out.println("결과 : 무한대");
		// }
		
		// 동시에 일어남. 따라서 if ~ else ~ 문 필요
		// 위에 두가지 합치기
		// if ( (input2 == 0) || (input2 == 0.0) ) {
		//	System.out.println("결과 :  : 무한대");
		// } else {
		//	double div = input1 / input2 ;
		//	System.out.println("결과 : " + div);
		// }
		
		// 0일때 멈춤다에 집중하면 안됨
		// 실제 프로그램은 정상적으로 동작하고 혹시나 예외(에러)나면 
		// 에러처리가 동작하도록 하는 것이 좋은 구조임
		// if (0으로 나누는 것이 아니라면 정상연산이무로)
		// 그게 아닐때(0으로 나누는 것이 아니게 아니다 = 0으로 나눈)
		
		// if ( (input2 != 0) || (input2 != 0.0) ) {
		//  	System.out.println("결과 : " + (input1 / input2));
		// } else {
		//  	System.out.println("결과 : 무한대");
		// }
		
		// input의 타입이 double이기 때문에 0, 0.0을 구분할 필요가 없음
		
		if (input2 != 0) {
			System.out.println("결과 : " + (input1 / input2));
		} else {
			System.out.println("결과 : 무한대");
		}
		
	}

}
