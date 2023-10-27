package extra.ch04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameExample2 {

	public static void main(String[] args) {
		//주먹 = 1, 가위 = 2, 보 = 3 정의 선언
		//변수는 바뀌면 안됨
		//상수는 대문자로 카멜 표기법 안됨 스네이크 표기법
		int ROCK = 1 ;
		int SCISSORS = 2 ;
		int PAPER = 3 ;		
		
		//배열로 가위바위보 1.2.3 인덱스로 찾기
		String[] game = {"", "ROCK바위", "SCISSORS가위", "PAPER보"};
		
		System.out.println("## 가위 바위 보 게임 ##");
		System.out.println("주먹 = 1, 가위 = 2, 보 = 3 ");
		System.out.println("가위! 바위! 보!");
		System.out.println("---------------------");
		
		// 내가 입력: 가상키보드 준비, 스캐너
		Scanner sc = new Scanner(System.in);
		int user =sc.nextInt() ;
		System.out.println("user = " + game[user]);
		
		// 컴퓨터 입력 : 난수, 랜덤클래스, 넥스트 인트로 불러옴
		int com = 0 ;
		Random r = new Random();
		com = r.nextInt(3) + 1;
		System.out.println("com = " + game[com]);
		
		System.out.println("---------------------");
		
		// 각자 낸것을 기억하는 
		
		// 판정하기
		// uesr과 com 비교하기
		if ( user == ROCK ) {
			if ( com == ROCK ) {
				System.out.println("비겼다 >ㅁ<");
			} else if ( com == SCISSORS ) {
				System.out.println("user # Win #");
			} else {
				System.out.println("com # Win #");
			}
		} 
		
		else if ( user == SCISSORS ) {
			if ( com == ROCK ) {
				System.out.println("com # Win #");
			} else if ( com == SCISSORS ) {
				System.out.println("비겼다 >ㅁ<");
			} else {
				System.out.println("user # Win #");
			}
		}
		
		else if ( user == PAPER ) {
			if ( com == ROCK ) {
				System.out.println("user # Win #");
			} else if ( com == SCISSORS ) {
				System.out.println("com # Win #");
			} else {
				System.out.println("비겼다 >ㅁ<");
			}
		}
		else {
			System.out.println("????????????");
		}
	}

}


