package extra.ch05;

import java.util.Scanner;

public class ch05_02_E6_성적입력최대평균 {

	public static void main(String[] args) {
		boolean run = true ;
		
		int studentNum = 0 ;
		int[] scores = null ;
		
		Scanner scanner = new Scanner(System.in) ;
		
//		scores = new int[3];
//		System.out.print("첫번째 학생 점수 : ");
//		scores[0] = Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 학생 점수 : ");
//		scores[1] = Integer.parseInt(scanner.nextLine());
//		System.out.print("세번째 학생 점수 : ");
//		scores[2] = Integer.parseInt(scanner.nextLine());
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0 ;
				int sum = 0 ;
				double avg = 0; 
				for(int i = 0; i < scores.length; i++) {
					// 삼항연산
				//	max = (max < scores[i]) ? scores[i] : max ;
					if(max < scores[i]) {
						max = scores[i];
					} else {
						max = max;
					}
					sum += scores[i];
				}
				avg = (double)sum/ studentNum;
				System.out.println("최고점수 : " + max + "점");
				System.out.println("평균점수 : " + avg + "점");
			} else if(selectNo == 5) {
				run = false ;
			}
		}
		System.out.println("프로그램 종료");
	}

}
