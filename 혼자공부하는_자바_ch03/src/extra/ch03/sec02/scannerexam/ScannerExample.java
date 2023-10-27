package extra.ch03.sec02.scannerexam;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// int를 입력받을 때 nextInt()이용
		
		Scanner scan = new Scanner(System.in);
		
		
		int a,b ;
		a = scan.nextInt(); // 스캐너로 정수 입력
		b = scan.nextInt();
		
		int result = a + b ;

		// 스캐너로 입력한 내용 출력
		System.out.println("a = " + a + " b = " + b);
		System.out.printf("%d + %d = %d ", a, b, result);
	}

}
