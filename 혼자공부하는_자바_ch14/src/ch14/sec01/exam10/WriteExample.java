package ch14.sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		// 데이터 도착지를 test10.txt로 하는 문자 기반 파일 출력스트림 생성
		Writer writer = new FileWriter("C:/temp/test10.txt");
		
		// 문자 데이터 준비
		String str = "중앙인재개발월";
				
		// 파일에 쓰기
		// 문자열 전체를 출력
		writer.write(str); 
		
		// 버퍼에 잔류하는 모든 문자열 출력
		writer.flush();
				
		// 출력스트림 닫음
		writer.close();

	}

}
