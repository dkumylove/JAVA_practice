package ch07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
//		// 필드 초기화
//		//dmbCellPhone 필드가 있나요?
//		dmbCellPhone.color = "보라색";
//		dmbCellPhone.model = "자바폰";
//		
		//DmbCellPhone을 작동시킵니다.
		String msg = """
				현재 DmbCellPhone클래스는 
					cellPhone 클래스로부터 상속 받았으나
					아무것도 추가한 것이 없습니다.
				""";
		System.out.println(msg);
		
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		System.out.println();
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		// 전원을 켤수 있을까요?
		dmbCellPhone.powerOn();
		// 전화벨소리가 들리수 있을까요?
		dmbCellPhone.bell();
		//"여보세요" 라는 메시지를 보낼수 있을까요?
		dmbCellPhone.sendVoice("여보세요.");
		//"안녕하세요"라는 메시지를 받을수 있을까요?
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		//"아~ 반갑습니다"라는 메시지를 받을수 있을까요?
		dmbCellPhone.sendVoice("아~ 예 반값습니다");
		//통화를 종료 할 수 있을 까요?
		dmbCellPhone.hangup();
		//전원을 끌수 있을까요?
		dmbCellPhone.powerOff();
				
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.thrnOffDmb();
	}

}
