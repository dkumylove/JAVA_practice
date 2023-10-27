package ch03.sec02.exam11;

public class ConditionOperationExample {

	public static void main(String[] args) {
		
	    // 점수 판정 예제
		// 제기
		int score = 85 ;
		
		// 점수가 90점이 아니무러 거짓부분이 실행됩니다,
		// 거짓부분에서 다시 삼항연산자를 비교하고 있습니다
		// 그 결과 80점보다 크무로 'B'갑이 선택됩니다.
		char grade = (score > 90) ? 'A' : ((score > 80)?'B' :'c') ;
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
