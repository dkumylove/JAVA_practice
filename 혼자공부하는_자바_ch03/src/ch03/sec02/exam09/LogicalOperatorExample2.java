package ch03.sec02.exam09;

import java.util.Scanner;

public class LogicalOperatorExample2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		String charCode = sc.nextLine() ;
		
		int chCode = Integer.parseInt(charCode);
		
		if( (chCode >= 65) && (chCode <= 90) ) {
		System.out.println("대문자군요");
		}
		
		if( (chCode >= 97) && (chCode <= 122) ) {
		System.out.println("소문문자군요");
		}
		
		if( (chCode < 48) && !(chCode > 57) ) {
			System.out.println("0~9 숫자군요");
		}	
		
		
		int value = 6 ;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수군요");
		}
	}

}



