package ch04.sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		
		while(true) {
			// 1~ 6의 난수 생성
			int num = (int)(Math.random() * 6) + 1 ;
			System.out.println(num);
			
			// numrk 6이면 루프종료
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
