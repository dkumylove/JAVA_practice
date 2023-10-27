package ch14.sec01.exam08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		// 데이터 도착지를 test8.txt로 하는 문자 기반 파일 출력스트림 생성
		Writer writer = new FileWriter("C:/temp/test8.txt");
		
		// 문자 데이터 준비
		char[] array = {'중', '앙', '인', '재', '개', '발', '원' };
				
		// 파일에 쓰기
		writer.write(array); //배열의 모든 문자열을 파일에 출력
		
		// 버퍼에 잔류하는 모든 문자열 출력
		writer.flush();
				
		// 출력스트림 닫음
		writer.close();

	}

}
