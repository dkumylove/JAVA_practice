package ch05.sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		//정수 배열 선언
		// 변수를 선언할때 값을 대입하는 것
		// int[] scores = {};  //빈배열
		
		//배열의 크기가 3인 정수 배열 생성
		int[] scores = { 83, 90, 87 };
		// or int scores [] => C언어 스타일
		
		//scores 배열의 첫번째 요소 index번호로 0
		System.out.println("scores[0] : " + scores[0]);
		//scores 배열의 두번째 요소 index번호로 1
		System.out.println("scores[1] : " + scores[1]);
		//scores 배열의 세번째 요소 index번호로 2
		System.out.println("scores[2] : " + scores[2]);
		System.out.println("--------------");
		
		// 반복문을 이용하여 출력해보기
		for(int index = 0 ; index < 3 ; index++) {
			//scores배열의 index번호로 배열의 각요소에 접근
			System.out.println("scores[" + index + "] : " + scores[index]);
		}
		
		
		// scores 배열의 크기(=갯수) 구하는 변수선언
		int scoresLength = 0;
		int sum = 0 ;
		for(int index = 0 ; index < 3 ; index++) {
			scoresLength++ ; // 현재 사용중인 배열의 수
		}
			
		for(int index = 0 ; index < 3 ; index++) {	
			sum += scores[index]; // 배열의 합
		}
		System.out.println("총배열수 : " + scoresLength);
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scoresLength ;
		System.out.println("평균 : " + avg);
	}

}
