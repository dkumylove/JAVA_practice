package extra.ch05;

import java.util.Scanner;

public class String연습2_학생1명성적 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 학생이름을 키보드로 입력을 받습니다.
		// 학생 국어성적, 영어성적, 수학성적을 입력받습니다.
		System.out.print("이름 : "); 
		String name = sc.nextLine();
		
		System.out.print("국어 : "); 
		int kor = sc.nextInt();
		System.out.print("영어 : "); 
		int eng = sc.nextInt();
		System.out.print("수학 : "); 
		int mat = sc.nextInt();
		
		
		// 총점을 구하고 평균을 구하세요
		int sum = kor + eng + mat;
		System.out.println("총점 : " + sum);
		
		double avg = (double)sum/ 3;
		System.out.println("평균 : " + avg );
		
		
		
	}

}
