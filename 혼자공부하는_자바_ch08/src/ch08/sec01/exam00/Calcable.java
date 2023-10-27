package ch08.sec01.exam00;

public interface Calcable {
	// 덧셈을 할수 있는 메소드 선언
	int add (int x, int y);
	
	// 반드시 구현
	// 고객이 프로그램에 다음의 사항은 반드시 지켜주세요라고 요청
	// 그럼 반드시 구현했는지 어떻게 강제 할수 있는가?
	// 예> int add(int x, int y)
	//     int sub(int x, int y)
	// 위의 두 메소드를 구현했는지 어떻게 보장 할 수 있는가?
	
}
