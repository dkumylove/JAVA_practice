package ch07.sec01.exam01;

public class DmbCellPhone extends CellPhone{
	//dmbCellPhone에서만 필욯나 기능
	// channel
	
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;      //CellPhone 클래스로부터 상속 받은 필드
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	//tv를 켠다
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	//채널을 변경한다
	void changeChannelDmb(int channml) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	//tv를 끈다
	void thrnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	
}
