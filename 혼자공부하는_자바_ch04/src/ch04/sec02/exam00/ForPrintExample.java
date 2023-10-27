package ch04.sec02.exam00;

public class ForPrintExample {

	public static void main(String[] args) {
		String greeting = " 안녕하세요";
		
		//for(시작값; 조건식; 증감값)
		for(int i = 1; i<=10; i++) {
			System.out.println(i + greeting);
		}
	}

}
