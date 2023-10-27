package ch03.sec02.exam02;

public class IncreaseDecreaseOperatorExample {

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
		
		System.out.println("----------복합 증감 연산----------");
		System.out.println("복합증감연산 전 기본값 z : " + z );
		System.out.println("복합증감연산 전 기본값 x : " + x );
		System.out.println("복합증감연산 전 기본값 y : " + y );
		System.out.println("--------------------------------");
		z = ++x + y++ ;
			// 전치증가연산 ++x(x=x+1) 1증가 => (x=14+1=15) x=15
		    // 후치증가연산 y++(y=y+1) 연산 이후에 증가 => (y=6) 연산후 증가 (y=6+1=7) y=7
		    // + 연산 진행후 z에 대입, (z=15+6=21) z=21
		System.out.println("연산후 z = " + z) ;
		System.out.println("연산후 x = " + x) ;
		System.out.println("연산후 y = " + y) ;
		
		System.out.println("---------복합 증감 연산---------");
		System.out.println("복합증감연산 전 기본값 z : " + z);
		System.out.println("복합증감연산 전 기본값 x : " + x );
		System.out.println("복합증감연산 전 기본값 y : " + y );
		System.out.println("--------------------------------");
		z = ++x + ++y;
		// 전치증가연산 ++x(x=x+1) 1증가 => (x=15+1=16) x=16
	    // 전치증가연산 y++(y=y+1) 1증가 => (y=7+1=8) y=8
	    // + 연산 진행후 z에 대입, (z=16+8=24) y=24 
		System.out.println("연산후 z = " + z) ;
		System.out.println("연산후 x = " + x) ;
		System.out.println("연산후 y = " + y) ;
		
		System.out.println("---------복합 증감 연산---------");
		System.out.println("복합증감연산 전 기본값 z : 0");
		System.out.println("복합증감연산 전 기본값 x : " + x );
		System.out.println("복합증감연산 전 기본값 y : " + y );
		System.out.println("--------------------------------");
		z = x++ + ++y ;
		// z = x + (1+y)
		// x = x + 1
		// 후치증가연산 x++(x=x+1) 연산 이후에 증가 => (x=16) 연산후 증가(x=16+1=11) x=17
	    // 전치증가연산 ++y(y=y+1) 1증가 => (y=8+1=9) y=9
	    // + 연산 진행후 z에 대입, (z=16+9=21) z=25 
		System.out.println("연산후 z = " + z) ;
		System.out.println("연산후 x = " + x) ;
		System.out.println("연산후 y = " + y) ;
		
		
	}

}
