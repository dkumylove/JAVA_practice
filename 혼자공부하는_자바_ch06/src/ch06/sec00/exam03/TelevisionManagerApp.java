package ch06.sec00.exam03;

public class TelevisionManagerApp {
	
//각 tv 객체의 특징인 필드를 화면에 보여줌
//	public static void printTvInfo(Television tv) {
//      System.out.println("tv info > "+ tv);
//      System.out.println("-------------------------");
//		System.out.println("tv.channel > " + tv.channel);
//		System.out.println("tv.volume > " + tv.volume);
//		System.out.println("tv.onOff > " + tv.onOff);
//		System.out.println("tv.brand > " + tv.brand);
//		System.out.println("tv.size > " + tv.size);
//		System.out.println("tv.owner > " + tv.owner);
//	}

	public static void main(String[] args) {
		/** Television클래스로부터 
		*  메모리에 tv1이라는 참조변수로 주소를 참조하는 객체생성
		*  클래스는 설계도 = 정의 = 실체가 아님
		* 객체는 설계도의 내용을 구현한 실체 = 메모리(힙)에 만들어짐
		*/
		
		// 속성메소드, 기능메소드 필요
		// 실무에서는 이렇게 사용하면 안됨

		
		//Television tv1
		Television tv1 = new Television();
		tv1.name = "tv1";
		tv1.channel = 7;
		tv1.volume = 3;
		tv1.onOff = true;
		tv1.brand = "LG";   
		tv1.size = 65; 
		tv1.owner = "홍길동";
		
		//Television tv2
		Television tv2 = new Television();
		tv2.name = "tv2";
		tv2.channel = 9;
		tv2.volume = 5;
		tv2.onOff = true;		
		tv2.brand = "SAMSUNG";  
		tv2.size = 75; 
		tv2.owner = "황진이";
		
		//Television tv3
		Television tv3 = new Television();
		tv3.name = "tv3";
		tv3.channel = 11;
		tv3.volume = 7;
		tv3.onOff = true;
		tv3.brand = "LG";   
		tv3.size = 85; 
		tv3.owner = "MART";
		
		// tv1, tv2같은지 비교
		if(tv1 == tv2) {
			System.out.println("tv1과 tv2는 같은 객체입니다.");
		} else {
			System.out.println("tv1과 tv2는 다른 객체입니다.");
		}
		
		System.out.println("========================");
		if(tv1.toString() == tv2.toString()){
			System.out.println("tv1 > " + tv1.toString());
			System.out.println("tv2 > " + tv2.toString());
			System.out.println("tv1과 tv2는 같은 객체입니다.");
		} else {
			System.out.println("tv1 > " + tv1.toString());
			System.out.println("tv2 > " + tv2.toString());
			System.out.println("tv1과 tv2는 다른 객체입니다.");
		}
		
		System.out.println();
		System.out.println("========================");
		tv1.printTvInfo();
		
		System.out.println();
		System.out.println("========================");
		tv2.printTvInfo();
		
		System.out.println();
		System.out.println("========================");
		tv3.printTvInfo();
		
		
		// tv3의 채널을 3번으로 변경
		tv3.setChannel(3);
		int ch = tv3.getChannel();
		
		// tv3의 변경된 채널값 알아보기
		System.out.println("tv3의 현재 channel은 " + ch + "입니다.");
		
	}

}
