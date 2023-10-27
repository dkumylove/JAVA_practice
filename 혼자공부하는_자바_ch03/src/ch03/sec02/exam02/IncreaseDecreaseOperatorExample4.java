package ch03.sec02.exam02;

public class IncreaseDecreaseOperatorExample4 {

	public static void main(String[] args) {
		/** 증감연산자의 기본사용법을 살펴봅시다*/
		int x = 10 ;
		int y = 10 ;
		int z ;
		
		System.out.println("---------복합 증감 연산---------");
		System.out.println("복합증감연산 전 기본값 z : 0");
		System.out.println("복합증감연산 전 기본값 x : " + x );
		System.out.println("복합증감연산 전 기본값 y : " + y );
		z = ++x + y++ ;
		// 전치증가연산 ++x(x=x+1) 1증가 => (x=10+1=11) x=11
	    // 후치증가연산 y++(y=y+1) 연산 이후에 증가 => (y=10) 연산후 증가(y=10+1=11) y=11
	    // + 연산 진행후 z에 대입, (z=11+10=21) z=21 
		System.out.println("연산후 z = " + z) ;
		System.out.println("연산후 x = " + x) ;
		System.out.println("연산후 y = " + y) ;
		
	}

}
