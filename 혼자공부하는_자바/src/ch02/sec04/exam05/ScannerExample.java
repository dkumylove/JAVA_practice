package ch02.sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData; // 입력된 데이터 저장 변수

		// 키보드로 계속 입력작업 반복
		while (true) {
			// scanner.nextLine() : 키보드로부터 문자열 입력
			inputData = scanner.nextLine(); // 문자열 한줄을 입력
			// inputData 화면에 출력
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			// 'q'를 입력하면 프로그램 종료
			if (inputData.equals("q")) {
				break;
			}
		}
		// 프로그램이 종료하게 되면 
		System.out.println("종료");
	}

}
