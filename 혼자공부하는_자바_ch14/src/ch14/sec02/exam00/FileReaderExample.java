package ch14.sec02.exam00;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// FileReader 사용예제
		// FileReader : 파일에 있는 내용을 문자방식으로 읽어온다
		FileReader fileReader = new FileReader("C:/temp/filedata.txt");

		// 한글자 읽어오기
		int ch;
		// read()가 한글자를 리턴할때 정수값으로 리턴 주의
		
		// 파일의 끝에 도착할때까지 계속 반복
		// 파일의 끝이 도착하면 -1을 리턴
		while(true) {
			// 한글자씩 입력스트림으로 부터 받음
			ch = fileReader.read();
			// 파일의 끝 (-1) 이면 루프 종료
			if(ch == -1) {
				break;
			}
			
			// 실제 처리하고 싶음 알고리즘, 여기선 그냥 화면에 출력
			// 입력받은 결과가 int형이므로 문자형으로 바꿀려면 (char)형으로 형변환 필요
			System.err.println((char)ch);	
		} // 파일처림 while 끝
		
		// fileReader 닫기
		fileReader.close();
	} // main 끝

}
