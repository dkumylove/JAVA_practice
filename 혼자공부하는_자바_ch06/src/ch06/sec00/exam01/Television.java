package ch06.sec00.exam01;

public class Television {
	//필드 정의
    int channel;     // 채널 번호
	int volume;      // 볼륨
	boolean onOff;   // 전원상태

	
	public static void main(String[] args) {
		// 텔리비전 객체를 만들어보자
		// 기본자료형을 사용하듯이
		// 클래스(사용자 데이터 자료형) 객체변경수
		//    = new 클래스명();
		// new : 메모리(램: 주기억장치)에 방을새로 만들어라
		// 클래스명() 생성자라는 메소드로 하는 역할은 데이터의 크기와 데이터의 종류를 알려준다.
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		//브랜드, 사이즈 추가, 소유자
		
		
		//tv객체의 상태를 출력
		System.out.println("텔레비전 채널은 " + tv.channel + "이고, 볼륨은" +  tv.volume + "입니다.");
	}

}
