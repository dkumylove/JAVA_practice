package ch04.sec01.exam04;

public class IfDiceExample2 {

	public static void main(String[] args) {
		
		// 1 ~ 6 임의의 주사위 눈금을 생성
		// double num = Math.random();   --->
		// double num = Math.random()*6;   --->
		// int num = (int) (Math.random()*6)+ 1;
		
		int num = (int) (Math.random()*6)+1;
		
		String msg = " 번이 나왔습니다.";
		
		if(num==1) {
			msg = num + msg ;
		} else if(num==2) {
			msg = num + msg ;
		} else if(num==3) {
			msg = num + msg ;
		} else if(num==4) {
			msg = num + msg ;
		} else if(num==5) {
			msg = num + msg ;
		} else if(num==6){
			msg = num + msg ;
		} else {
			msg = "주사위 번호가 잘못되없습니다.";
		}
		
		
		// 결과 출력
		System.out.println(msg);

	}

}
