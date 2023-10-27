package ch03.sec02.exam02;

public class IncreaseDecreaseOperatorExample3 {

	public static void main(String[] args) {
		/** 증감연산자의 기본사용법을 살펴봅시다*/
		int x = 10 ;
		int y = 10 ;
		int z ;
		
		//구분선 출력
		// 증가연산 ++
		System.out.println("------------증가연산--------------");
		System.out.println("증가연산 전 기본값 x =" + x);
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
		
		// 증가연산자와 다른 변수의 상호 작용
		System.out.println("----------------------------------");
		System.out.println("후치증가연산과 다른변수의 상호작용");
		z = x++ ; // 후치증가연산은 z = x를 먼저 실행, 그후에 x++(x=x+1) 실행
		          // z변수의 값과 x변수의 값 +1 차이가 난다.
		System.out.println("z = " + z + " (x++)") ;
		System.out.println("x = " + x) ;
		System.out.println("----------------------------------");
		System.out.println("전치증가연산과 다른변수의 상호작용");
		z = ++x ; // 전치증가연산은 ++x(x=x+1)를 먼저실행, x변수의 내용이 +1증가
		          // 그 변경된 x의 값을 z에 대입, x도 변하고 z도 변함
		          // x의 값이 변한 후 z에 대입
		System.out.println("z = " + z + " (++x)") ;
		System.out.println("x = " + x) ;
		
		// 감소연산자와 다른 변수의 상호 작용
		System.out.println("----------------------------------");
		System.out.println("후치감소연산과 다른변수의 상호작용");
		z = y-- ; // 후치증가연산은 z = y를 먼저 실행, 그후에 y--(y=y-1) 실행
		          // z변수의 값과 y변수의 값 -1 차이가 난다.
		System.out.println("z = " + z + " (y--)") ;
		System.out.println("y = " + y) ;
		System.out.println("----------------------------------");
		System.out.println("전치감소연산과 다른변수의 상호작용");
		z = --y ; // 전치증가연산은 --y(y=y-1)를 먼저실행, y변수의 내용이 -1감소
		          // 그 변경된 y의 값을 z에 대입, y도 변하고 z도 변함
		          // y의 값이 변한 후 z에 대입
		System.out.println("z = " + z + " (--y)") ;
		System.out.println("y = " + y) ;
		
		
	}

}
