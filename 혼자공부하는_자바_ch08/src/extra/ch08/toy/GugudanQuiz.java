package extra.ch08.toy;

import java.util.Random;

public class GugudanQuiz extends Quiz {
	// 필드
	
	// 생성자
	GugudanQuiz(){
		creatQuesthion();
	}
	
	//메소드
	@Override
	void creatQuesthion() {
		// 프로그램의 흐름을 출력하는 로그 명령
		// System.out.println("문제를 출제합니다."); 잘실행되는지 확인
		
		// 구구단퀴즈 알고리즘
		// 1. 난수로 몇단인가를 생성 - 확장> 사용자에게 입력받기
		// 2. 출제된 구구단 계산결과에서 사용자에게 보여주지 않을 위치 번호생성
		//   ex)난수로 3단을 생성 3열을 안보여 주려고한다.
		//      위치      :  1|  2|  3|  4|  5|  6|  7|  8|  9|
		//      구구단 값 :3*1|3*2|  0|3*4|3*5|3*6|3*7|3*8|3*9|
		// 난수 발생
		// 3. 구구단 계산 결과를 화면에 출력
		//    화면에 보여줄 계산 결과와 화면에 보여주지 않을 사용자 입력학 결과
		//    두가지를 합쳐서 문제 생성 문자열을 화면에 출력
		// 4. 정답 문자열을 생성
		// 5. 힌트 문자열을 생성
		
		// 1. 
		// Math.random() : 사용하기 편함 대신 세세한 설정하려할때 복잡함
		// Random클래스 : 객체를 생성해야하고 메소드를 학습해야하지만 응요성좋음
		Random rnd = new Random();
		
		// 2.
		// 몇단인가 난수 생성
		// 열거형 자리형을 사용할때 next를 사용
		int dan = rnd.nextInt(9) +1 ; // 0 <= dan < 10인 정수
		
		// 출제된 문제에서 감춰질 위치번호
		int qId = rnd.nextInt(10); // 0 <= qId < 10인 정수
		
		final int MAX_QUESTION_ID = 9; // 구구단의 마지막 열
		
		// 3.
		// 화면에 출력할 문자열
		// 문제와 정답을 두개 필요
		this.question = ""; // 현재 문제 출제 안함
		this.answer = "";   // 현재 정답 생성 안함
		
		//	구구단 열을 생성하는 루프 1~9
		for( int i = 0; i < MAX_QUESTION_ID; i++) {
			// 동시에 일어아냐하고 선택을 함
			// if ~ else 구문사용
			// 구구단 계산 결과를 보여줄때
			if( i == (qId -1)) {  //우리가 생각하는 위치와 컴퓨터가 생각하는 위치가
								  // 1차이가 있으므로
				this.question += "[o]";   // 빈칸 출력
				
				
			} else {  //보여주지 않을때
				this.question += "[" + (dan * (i + 1)) + "]";  // 그 열의 구구단값을 출력
				// for 루프가 0부터 인덱스를 세고 있으므로 1열부터 계산 하려면 인덱스 + 1
			}
				
		}
		// 문제 문자열 완성
		this.question += "\nQ : o 에 들어갈 수는 몇일까요?";
		// 장답 문자열 완성
		this.answer = "A : " + (dan * qId);
				
	} //@Overrid creatQuesthion() 끝

	@Override
	public String getHint() {// 힌트추가
		return "우선 구구단이 몇단인지 생각해보세요.";
		
	}
	
}
