package ch06.sec00.exam03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Television {
	//필드 정의
	String name;
	int channel;     // 채널 번호
	int volume;      // 볼륨
	boolean onOff;   // 전원상태
	
	String owner;    // 소유자
	String brand;    // 브랜드
	int size;        // 사이즈

	///////////////////////////////////
	/// 속성메소드
	//////////////////////////////////
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getChannel() {
//		return channel;
//	}
//
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
//
//	public int getVolume() {
//		return volume;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//
//	public boolean isOnOff() {
//		return onOff;
//	}
//
//	public void setOnOff(boolean onOff) {
//		this.onOff = onOff;
//	}
//
//	public String getOwner() {
//		return owner;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public void setSize(int size) {
//		this.size = size;
//	}
	
//	//get = read
//	//channel을 읽어라
//	public int getChannel() {
//		return channel;	
//	}
//	
//	//set = change
//	// channel을 바꿔라
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
	
	/////////////////////////////////////////
	///기능메소드
	////////////////////////////////////////
	// tv 정보출력
	public void printTvInfo() {
		System.out.println(name +  ".info > "+ this);
	    System.out.println("-------------------------");
		System.out.println(name + ".channel > " + channel);
		System.out.println(name + ".volume > " + volume);
		System.out.println(name + ".onOff > " + onOff);
		System.out.println(name + ".brand > " + brand);
		System.out.println(name + ".size > " + size);
		System.out.println(name + ".owner > " + owner); //this가 생략된건임
		// System.out.println("tv.owner > " + this.owner);
		}

}

