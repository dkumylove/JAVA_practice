package ch04.sec02.exam07;

public class WhileSumFrom1To10Example {

	public static void main(String[] args) {
		int sum = 0 ; // 합계저장변수
		int i = 1 ;   // 루프카운터변수 i, j, k 변수이름을 담아서 사용하는 것이 좋음
		
		while( i <= 1000 ) {
			sum += i ;
			i++ ;
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
