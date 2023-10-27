package ex.ch09;

public class ch09_01_Ex05_CheckBox {
	// 인터페이스 타입 필드
	// 체크박스는 자신이 선텍되면 실행할 데이터 타입(인터페이스)
	// 이밴트 핸들러 = 이벤트 리스터 = 이벤트 처리기:
	// 이벤트(어떤 약속한 상태)의 변화를 감지하면 예정된 행동을 실행하는 것
	OnSelectListener listener;    // 이벤트핸들러 필드
	
	//setter 메소드(속성메소드)
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	// 이벤트 발생을 시뮬레이션하는 메소드
	void select() {
		// 구현 객체의 onSelect() 메소드 호출
		listener.onSelect();
	}
	
	// 중첩 인터페이스
	// 이벤트 자바에서는 이베트를 인터페이스를 이용해서 선언(정의)
	static interface OnSelectListener {
		// 인터페이스의 메소드 - 구현객체 필요
		void onSelect();
	}
}
