package extra.ch08.toy;

public class FourBasicCalcQuizExample {

	public static void main(String[] args) {

		Quiz quiz = new FourBasicCalcQuiz();
		
		// 문제 출제
		System.out.println(quiz.getQuestion());
		
		// 적당한 게임요소 추가 가능
		// 힌트 출력
		System.out.println("힌트 : " + quiz.getHint());
		
		// 정답 출력
		System.out.println(quiz.getAnswer());
				

	}

}
