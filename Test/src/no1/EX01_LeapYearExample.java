package no1;

import java.io.IOException;
import java.util.Scanner;

public class EX01_LeapYearExample {

	public static void main(String[] args) throws IOException {
		// 윤년의 조건 
		// 1> 4로 나누어 떨어진때
		// 2> 4로 나누어 떨어지고, 100으로 나누어 떨어지지 x
		// 3> 4, 100, 400 으로 나누어 떨어지는 경우(100 = 400안에 포함)
		//   = 4, 400으로 나누어 떨어지는 경우 (100 = 400안에 포함)
		
		// 스캔입력받기
		Scanner sc = new Scanner(System.in);
		
		// 안내문
		System.out.println("년도를 입력하세요");
		
		// 입력받은 값 저장
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		

	}

}
