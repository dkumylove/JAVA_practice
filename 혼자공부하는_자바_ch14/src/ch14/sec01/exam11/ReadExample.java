package ch14.sec01.exam11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		// 데이터 출발지를 test7.txt로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/temp/test7.txt");
		
		// 파일이 끝에 도달할떄까지 읽는 작업 반복
		while(true) {
			// 한 문자씩 읽기
			int data = reader.read();
			// 파일 끝에 도달했을 결우
			if(data == -1) {
				break;
			}
			System.out.println((char)data);
		}
		//입출력 스트림을 닫음
		reader.close();

	}

}
