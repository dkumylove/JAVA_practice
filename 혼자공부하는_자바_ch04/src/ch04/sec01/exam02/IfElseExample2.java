package ch04.sec01.exam02;

import java.util.Scanner;

public class IfElseExample2 {

	public static void main(String[] args) {
		
		//스캐너 추가
		
		System.out.println("점수를 입력해 주세요.");
		
		// 점수를 키보드로 입력받기
		Scanner sca = new Scanner(System.in);
				
		// nextInt 사용	
		int score = sca.nextInt();
		// int score = 85;
		
		// 등급변수 선언, 문자열이나 문자
		char grade = '\u0000'; //\u0000 알파벳 문자가 아닌 0000 = null 값으로 입력
		
		// 점수를 판정한다.
		// 90점 이상이면 A    (score >= 90) 
		// 아니면 B
		 if (score >= 90) {
		 	grade = 'A' ;
		 } else {
		 	grade = 'B';
		 }
		
		// 점수를 출력
		// System.out.println("점수가 90보다 큽니다.");
		// System.out.println("등급은 A입니다.");
		//	
		// 위에 두가지 변수를 넣어 합침
		// System.out.println("입력한 점수는 " + score + "입니다.");
		// System.out.println("점수가" + score +"점보다 큽니다." );
		// System.out.println("등급은" + grade + "입니다.");
		
		
		 if(score>=90) {
			System.out.println("입력한 점수는 " + score + "입니다.");
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은" + grade + "입니다.");
		 } else {
		 	System.out.println("입력한 점수는 " + score + "입니다.");
		 	System.out.println("점수가 90점보다 작습니다.");
		 	System.out.println("등급은" + grade + "입니다.");
		 }

	}

}
