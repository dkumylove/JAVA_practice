package ch09.sec01.exam06;

public class Button {
	// 인터페이스 정의
	// 여기서 두가지 의미로 사용
	// 자바의 다중 상속을 정의하는 메소드 선언
	// 버튼 클래스와 이벤트가 발생할 때 자동 호출(콜백)되는 이벤트 핸들러의 연결고기
	
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	// 인터페이스를 등록
	// setter 메소드
	// 매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 실제 하드웨어로 구현하나 지금은 시뮬레이션(가정)
	// 화명이 있다고 보고 화면누르면
	void touch() {
		// 구현 객체의 onClick() 메소드 호출
		listener.onClick();
	}
	
	static interface OnClickListener {
		// 중첩 인터페이스
		void onClick();
	}

}
