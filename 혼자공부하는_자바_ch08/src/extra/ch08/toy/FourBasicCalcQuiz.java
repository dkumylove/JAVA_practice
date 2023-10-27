package extra.ch08.toy;

import java.util.Random;

public class FourBasicCalcQuiz extends Quiz {
	// 필드
	final int CALC_ADD = 0;
	final int CALC_SUB = 1;
	final int CALC_MUL = 2;
	final int CALC_DIV = 3;
	final int CALC_MAX_NUM = 100;
	
	String hint;
	
	// 생성자
	FourBasicCalcQuiz(){
		creatQuesthion();
	}
	
	
	// 메소드
	@Override
	public String getHint() {
		return this.hint;
	}

	@Override
	void creatQuesthion() {
		Random rnd = new Random();
		
		int choice = rnd.nextInt(4);
		int num1 = 0;
		int num2 = 0;
		
		this.question = ""; // 현재 문제 출제 안함
		this.answer = "";   // 현재 정답 생성 안함
		this.hint = "";
		
		// 계산결과 사용에게 입력받음
		// 그 계산 결과와 사용자의 입력결과 비교
		// 참 거짓 출력
		
		switch (choice) {
		case CALC_ADD : // 덧셈
			// 두수의 난수 발생, 그 두수의 연산자 화면에 출력, 
			// 문제출력 ex) 문제 : 100 + 100 = ??? 연산결과는 ?
			// 그 문제의 정답 출력 ex) 문제 : 100 + 100 = 200 입니다
			// 도움말 출력 ex) 두수의 연산에 대한 문제입니다.
			num1 = rnd.nextInt(CALC_MAX_NUM);
			num2 = rnd.nextInt(CALC_MAX_NUM);
			int add = num1 + num2;
			this.question = "문제 : " + num1 + " + " + num2 + " = ??? 연산결과는 ?";
			this.answer = "정답 : " + add;
			this.hint =	"두 정수의 덧셈에 대한 문제입니다."	;
			break;
		case CALC_SUB : // 뺄셈
			num1 = rnd.nextInt(CALC_MAX_NUM);
			num2 = rnd.nextInt(CALC_MAX_NUM);
			int sub = num1 - num2;
			this.question = "문제 : " + num1 + " - " + num2 + " = ??? 연산결과는 ?";
			this.answer = "정답 : " + sub;
			this.hint =	"두 정수의 뺄셈에 대한 문제입니다."	;			
			break;
		case CALC_MUL : // 곱셈
			num1 = rnd.nextInt(CALC_MAX_NUM);
			num2 = rnd.nextInt(CALC_MAX_NUM);
			int mal = num1 * num2;
			this.question = "문제 : " + num1 + " * " + num2 + " = ??? 연산결과는 ?";
			this.answer = "정답 : " + mal;
			this.hint =	"두 정수의 곱셈에 대한 문제입니다."	;
			break;
		case CALC_DIV : // 나눗셈
			num1 = rnd.nextInt(CALC_MAX_NUM);
			num2 = rnd.nextInt(CALC_MAX_NUM);
			int div = num1 / num2;
			this.question = "문제 : " + num1 + " / " + num2 + " = ??? 연산결과는 ?";
			this.answer = "정답 : " + div;
			this.hint =	"두 정수의 나눗셈에 대한 문제입니다.";
			break;
			
		}
		
	}

}
