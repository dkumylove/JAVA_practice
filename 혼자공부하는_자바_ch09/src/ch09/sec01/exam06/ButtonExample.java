package ch09.sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		// 실제 버튼을 누르면 실행할 일벤트 핸들러 등록
		// 버튼이 눌려지면 자동으로 호출할 메소드 등록
		btn.setOnClickListener(new CallListener());
		// 실제 버튼 동작(touch)
		btn.touch();
		
		// 또 다른 이벤트 핸들러 등록
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
	}

}
