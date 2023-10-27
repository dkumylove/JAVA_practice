package extra.ch07;

public class Programming {
	void 연산기능() {
		System.out.println("연산기능을 실행합니다.");
	}
	
	void 입력기능(){
		System.out.println("데이터를 입력합니다.");
	}

	void 출력기능(){
		System.out.println("데이터를 출력합니다.");
	}

	private void 제어기능(){
		System.out.println("조건을 비교하여 선택 실행합니다.");
	}
	
	private void 반복기능(){
		System.out.println("정해진 수만큼 반복합니다.");
	}
	
	void toDoEnable() {
		System.out.println(">>>>여기는 프로그래밍 객체의 toDoEnable() 기능입니다.");
		연산기능();
		입력기능();
		출력기능();
		제어기능();
		반복기능();
		System.out.println("-프로그래멩의 객체 toDoEnable() 기능 끝");
		
	}
}
