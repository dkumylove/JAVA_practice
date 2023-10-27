package ch14.sec01.exam13;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		// 데이터 출발지를 test9.txt로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/temp/test9.txt");
		
		// 파일로부터 읽어온 데이터를 저장할 변수
		char[] buffer = new char[5];
		
		// 입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4],
		int readCharNum = reader.read(buffer, 2, 3);
		// 읽은 문자가 있다면
		if(readCharNum != -1) {
			// 배열 전체를 읽고 출력
			for(int i = 0; i < buffer.length; i++) {
			System.out.println(buffer[i]);
			}
		}
		//입출력 스트림을 닫음
		reader.close();

	}

}
