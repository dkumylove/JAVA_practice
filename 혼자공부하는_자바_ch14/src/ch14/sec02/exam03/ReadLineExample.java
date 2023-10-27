package ch14.sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		// 문자 기반 입력 스트림 얻기
		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		// BufferedReader 보조 스트림 연결
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			// 라인 단위 문자열을 읽고 리턴
			String data = br.readLine();
			// 파일 끝에 도달했을 경우
			if( data == null) break;
			System.out.println(data);
		}
		
		// 입력스트림 닫기
		br.close();
	}

}
