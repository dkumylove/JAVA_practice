package ch06.sec06.exam02.mycompany;

import ch06.sec06.exam02.hankook.SnowTire;
import ch06.sec06.exam02.hyundai.Engine;
import ch06.sec06.exam02.kumho.BigWidthTire;

public class Car {
	//필드
	//엔진
	Engine engine = new Engine();
	//타이어 겨울용
	SnowTire tire1 = new SnowTire();
	//타이어 우천용
	BigWidthTire tire = new BigWidthTire();
	//
	
	ch06.sec06.exam02.hankook.Tire tire3 = new ch06.sec06.exam02.hankook.Tire();
	ch06.sec06.exam02.kumho.Tire tire4 = new ch06.sec06.exam02.kumho.Tire();
}
