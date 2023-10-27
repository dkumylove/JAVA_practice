package ch09.sec02.exam02;

public class Anonymous {
	// Anonymous 클래스 필드
	private int channel = 3;
	
	// Anonymous 클래스 속성 메소드
	public void setChannel(int channel) {
		System.out.println("Anonymous||setChannel");
		this.channel= channel;
	}
	
	public int getChannel() {
		System.out.println("Anonymous||getChannel");
		return this.channel;
	}
	
	
	// 1. 필드 초기값으로 익명 구현 객체 사용
	// 필드 선언과 초기값 대입
	RemoteControl field = new RemoteControl() {
		// 현재 익명구현 클래스의 내부 필드
		public int channel = 3;
		
		// 현재 익명구현 클래스의 내부 필드용 속성메소드
		public void setChannel(int channel) {
			System.out.println("익명구현객체||setChannel");
			this.channel= channel;
		}
		
		public int getChannel() {
			System.out.println("익명구현객체||getChannel");
			return this.channel;
		}
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			System.out.println("현재 채널을 " + this.channel + "로 변경했습니다.");
			}
		@Override
		public void turnOff() {
			this.setChannel(7);
			System.out.println("현재 채널은 " + this.getChannel() + "입니다.");
			System.out.println("TV끕니다.");
		}
	};
	
	void method1() {
		// 2. 메소드 로컬변수 값으로 익명 구현 객체 사용
		// 로컬 변수값으로 대입
		RemoteControl localVer = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}	
		};	
		
		// 3. 메소드 매개변수값으로 익명 구현 객체 사용
		// 로컬 변수 사용
		localVer.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
