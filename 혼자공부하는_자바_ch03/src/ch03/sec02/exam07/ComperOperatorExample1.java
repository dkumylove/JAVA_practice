package ch03.sec02.exam07;

public class ComperOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 10 ;
		boolean result1 = (num1 == num2) ;
		boolean result2 = (num1 != num2) ;
		boolean result3 = (num1 <= num2) ;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		char char1 = 'A' ;
		char char2 = 'B' ;
		boolean result4 = (char1 < char2) ;
		System.out.println("result4 = " + result4);
	
		char char3 = 'C' ;
		char char4 = 'B' + 1 ;
		int i = 100 ;
		boolean result5 = (char3 < char4) ;
		boolean result6 = (char3 < i) ;  //(65 < 100)
		System.out.println("result5 = " + result5);
		System.out.println("result6 = " + result6);
		
	}

}
