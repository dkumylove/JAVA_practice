package ch09.sec02.exam03;

public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	// 매개변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		// 구현 객체의 onClick()메소드 호출
		listener.onClick();
	}
	
	// 중첩 인터페이스
	static interface OnClickListener{
		// 메소드 재정의 필요
		void onClick();
	}
}
