package ch14.sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		// 데이터 도착지를 test7.txt로 하는 문자 기반 파일 출력스트림 생성
		Writer writer = new FileWriter("C:/temp/test7.txt");
		
		// 문자 데이터 준비
		char a = 'A'; // a변수의 내용을 Writer 출력에 전송
		char b = 'B';
		char c = 'C';
				
		// 출력스트림에 출력
		// 한문자씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		// 버퍼에 잔류하는 모든 문자열 출력
		writer.flush();
		
		// 출력스트림 닫음
		writer.close();
	}

}
