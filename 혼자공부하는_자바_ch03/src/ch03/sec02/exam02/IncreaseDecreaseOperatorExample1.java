package ch03.sec02.exam02;

public class IncreaseDecreaseOperatorExample1 {

	public static void main(String[] args) {
		/** 증감연산자의 기본사용법을 살펴봅시다*/
		int x = 10 ;
		int y = 10 ;
		int z ;
		
		//구분선 출력
		System.out.println("------------증가연산--------------");
		System.out.println("증가연산 전 기본값 x =" +x);
		x++ ; // 후치 증가 연산
		System.out.println("후치 증가연산 x++ = " + x) ;
		++x ; // 전치 증가 연산
		System.out.println("전치 증가연산 ++x = " + x) ;
		// 감소연산 --
		System.out.println("------------감소연산--------------");
		System.out.println("감소연산 전 기본값 y =" + y);
		y-- ; // 후치 감소 연산
		System.out.println("후치 감소연산 y-- = " + y) ;
		--y ; // 전치 감소 연산
		System.out.println("전치 감소연산 --y = " + y) ;
		
	}

}
