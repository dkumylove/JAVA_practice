package ch04.sec02.exam01;

public class ForPrintFrome1To10Example {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			System.out.println(i);	
		}
		
		
		int sum = 0;
		int sum1 = 0;
				
		System.out.println("-------------------");	
		for(int i =1; i<=100; i++) {
			if( i % 2 == 1 ) {
				sum = sum +i;
			}	
			
			if( i% 3 == 0) {
				sum1 = sum1 + i;
			}
			
		}	
		System.out.println("2의 배수 : " + sum);
		System.out.println("2의 배수 : " + sum1);
	}

}
