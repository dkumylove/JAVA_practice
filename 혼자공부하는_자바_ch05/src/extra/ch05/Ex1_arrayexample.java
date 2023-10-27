package extra.ch05;

public class Ex1_arrayexample {

	public static void main(String[] args) {
		// 베열선언하기
		// 10명의 학생성적저장하는 배열
		// 선언만 했습니다.
		// int[] score = new int[10];
		String[] score = new String[10];
		
		
		// 초기화 아직 안함
		// 초기화 new타입[]{}; 형식
		//score = new String[] {""};
		
		// 기본타입은 초기화를 안하면 0에 가까운 값으로 자동 초기화
		
		// 혹시 이상테에서 배열의 내용을 출력해보면
		for( int i = 0; i < score.length; i++) {
			System.out.println("[" + i + "] = " + score[i]);
		}
	}

}
