package extra.ch08.toy;

// 추상클래스 : 불완전(준비가 덜되어있는)
// 객체생성 불가, new 생성자를 사용할수 없음
// 반드시 상속 필요
public abstract class Quiz implements HintHelper {
	// 필드
	// 퀴즈에 필요한 문제, 해답 - 이후 확성성이 많음. ex) Q&A
	String question;     // 문제 저장 필드
	String answer;       // 정답 저장 필드
	
	
	//생성자
	
	// 메소드
	// 문제 출제는 문제 출제 알고리즘에 따라서 출제 내용이 바뀔 수있으므로 
	// 추상 메소드로 만든다
	// 출제한 질문과 정답은 벼도의 필드변수에 저장됨 리턴값 void
	// 필드가 있으면 리턴값 필요없음. 필드가 없으면 리턴값 필요함
	
	// 문제를 출제하는 메소드
	abstract void creatQuesthion();
	
	// 필드의 값을 리턴한다 = 속성 메소드 getter, setter
	// 문제를 리턴하는 메소드
	String getQuestion() {
		return this.question;
	}
	
	// 정답을 리턴하는 메소드
	String getAnswer() {
		return this.answer;
	}
	
}
