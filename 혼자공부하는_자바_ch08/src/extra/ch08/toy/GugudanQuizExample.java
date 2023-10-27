package extra.ch08.toy;

public class GugudanQuizExample {

	public static void main(String[] args) {
		// 여기에 문제 출제 객체가 생성
		// 추상클래스 Quiz는 직접 객체생성x
		// Quiz를 상속받은 실현클래스의 객체를 가르킬수는 있음(부모클래스이기때문)
		// upocasting
		Quiz quiz = new GugudanQuiz(); // 자동형변환
		// 다운캐스팅 : 부모가 다시 자식을 가르키도록 강제형변환
		// 자식 객체의 멤버를 다시 참조 할수 있다.
		GugudanQuiz gugudan = (GugudanQuiz) quiz;
		
		// 상속받아 재정의한 메소드 creatQuesthion()를 실행
		//quiz.creatQuesthion();  생성자가 생길때 바로 실행되게 바꾸었기때문에
	
		// 문제 출제
		System.out.println(quiz.getQuestion());
		
		// 적당한 게임요소 추가 가능
		// 힌트 출력
		System.out.println(quiz.getHint());
		
		// 정답 출력
		System.out.println(quiz.getAnswer());
				
		
	}

}
