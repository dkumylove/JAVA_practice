package extra.ch05;

import java.util.Scanner;

public class String연습1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 학생이름을 키보드로 입력을 받습니다.
		// 학생 국어성적, 영어성적, 수학성적을 입력받습니다.
		System.out.println("***첫번째 학생***");
		System.out.print("이름 : "); 
		String name1 = sc.nextLine();
		
		System.out.print("국어 : "); 
		int kor1 = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : "); 
		int eng1 = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : "); 
		int mat1 = Integer.parseInt(sc.nextLine());
		
		int sum1 = kor1 + eng1 + mat1;
		System.out.println(name1 + "학생 총점 : " + sum1);
		double avg1 = (double)sum1/ 3;
		System.out.println(name1 + "학생 평균 : " + avg1 );
		
		///////////////////////////////////////////////////////////
		System.out.println("\n***두번째 학생***");
		System.out.print("이름 : "); 
		String name2 = sc.nextLine();
		
		System.out.print("국어 : "); 
		int kor2 = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : "); 
		int eng2 = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : "); 
		int mat2 = Integer.parseInt(sc.nextLine());
		
		int sum2 = kor2 + eng2 + mat2;
		System.out.println(name2 + "학생 총점 : " + sum2);
				double avg2 = (double)sum2/ 3;
		System.out.println(name2 + "학생 평균 : " + avg2 );

		///////////////////////////////////////////////////////////
		System.out.println("\n***세번째 학생***");
		System.out.print("이름 : "); 
		String name3 = sc.nextLine();
		
		System.out.print("국어 : "); 
		int kor3 = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : "); 
		int eng3 = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : "); 
		int mat3 = Integer.parseInt(sc.nextLine());
		
		int sum3 = kor3 + eng3 + mat3;
		System.out.println(name3 + "학생 총점 : " + sum3);
		double avg3 = (double)sum3/ 3;
		System.out.println(name3 + "학생 평균 : " + avg3);
		
		System.out.println("\n***전체 합계 & 평균***");
		int totelSum = sum1 + sum2 + sum3 ;
		System.out.println("전체 합계 : " + totelSum);
		double totelAvg = (avg1 + avg2 + avg3)  /3 ;		
		System.out.println("전체 평균 : " + totelAvg);
		
		
		
	}

}
