package ex.ch09;

public class ch09_01_Ex05_CheckBoxExample {

	public static void main(String[] args) {
		// 화면의 checkbox위젯을 배치
		// 지금 화면에 checkbox가 화면에 배치되었다고 가정
		ch09_01_Ex05_CheckBox checkBox = new ch09_01_Ex05_CheckBox();
		
		// checkbox객체에 이벤트 핸들러 등록
		checkBox.setOnSelectListener(new ch09_01_Ex05_BackgroundChangeListener());
		
		// checkbox위젯에 장제로 OnSelect이벤트 발생
		checkBox.select();
	}

}
