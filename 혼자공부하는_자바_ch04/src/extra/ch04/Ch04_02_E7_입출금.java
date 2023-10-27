package extra.ch04;

import java.util.Scanner;

public class Ch04_02_E7_입출금 {

	public static void main(String[] args) {
		boolean run = true ;
		int balance = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> " );
			
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
			// balance에 예금액 더함
			case 1 :
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			// balance에 출금액 뺌		
			case 2 :
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			// balance를 출력		
			case 3 :
				System.out.println("잔고> " + balance);
				break;
			// while이 false로 만들면 while문 종료
			case 4 :
				run = false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
