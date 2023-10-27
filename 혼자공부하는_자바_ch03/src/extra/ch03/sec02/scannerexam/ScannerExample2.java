package extra.ch03.sec02.scannerexam;

import java.io.IOException;

public class ScannerExample2 {

	public static void main(String[] args) throws IOException {
		/// char문자를 하나 입력받아보자
		/// char를 입력받을때는 System.in.read()이용
		/// 입력받은 값을 (char) 강제 형변환한다.
		/// System.in.read() 결과값이 int형이므로
		
		char ch;
		ch = (char)System.in.read();
		
		// 결과 출력
		System.out.println("입력한 char = " +ch);
		
		
	}

}
