package ch03.sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// 성적 등급산출 이전 시험을 보았는지 확인하는
		int charCode = 'A' ;
		
		if( (charCode >= 65) & (charCode <= 90) ) {
		System.out.println("대문자군요");
		}
		
		if( (charCode >= 97) && (charCode <= 122) ) {
		System.out.println("소문문자군요");
		}
		
		if( (charCode < 48) && !(charCode > 57) ) {
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
