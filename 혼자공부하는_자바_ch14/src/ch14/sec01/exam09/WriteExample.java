package ch14.sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		// 데이터 도착지를 test9.txt로 하는 문자 기반 파일 출력스트림 생성
		Writer writer = new FileWriter("C:/temp/test9.txt");
		
		// 문자 데이터 준비
		char[] array = {'T', '0', 'M', '황', '진', '희' };
				
		// 파일에 쓰기
		// 배열의 3번 인덱스부터 3개를 출력
		writer.write(array, 3, 3);
		
		// 버퍼에 잔류하는 모든 문자열 출력
		writer.flush();
				
		// 출력스트림 닫음
		writer.close();

	}

}
