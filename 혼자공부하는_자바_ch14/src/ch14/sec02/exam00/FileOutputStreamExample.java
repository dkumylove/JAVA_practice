package ch14.sec02.exam00;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// 1. 바이트방식 파일 스트림을 먼저 만듬
		//  ex) FileOutputStream("파일경로", 추가가능여부), 기본값은 true, 
		//  추가가능여부 : true = 이어서 작성, false = 새롭게 작성(덮어쓰기)
		FileOutputStream fos = new FileOutputStream("C:/temp/StreamData.txt", false);
		
		// 2. 스트림에 OutputStreamWriter보조스트림을 연결
		//  바이트방식스트림을 문자 스크림처럼 다르겠음
		//  new OutputStreamWriter(출력 바이트 스트림, 인코딩문자형식);
		//  출력스트림을 UTF-8 방식으로 변환하여 출력
		//  실제로 끝점(EndPoint)의 출력방식이 파일출력스트림이므로 파일저장
		OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
		// 참조변수가 다른 인코딩방식 객체를 가르키도록 바꿈
		// writer = new OutputStreamWriter(fos, "EUC-KR");
		
		// 3. 이스트림들에 다시 쓰기 속도를 올리기 위해 버퍼를 이용, 한꺼번에 버터를 쓰기 작업
		BufferedWriter bw = new BufferedWriter(writer);
		
		// 4. 프로그램 => 버퍼쓰기스트림 => 문자쓰기스트림 => 바이트쓰기스트림
		bw.write("안녕하세요.");
		bw.write("\r\n저는 자바입니다.");
		bw.append("저는 인터넷에 강한 언어입니다.\r");
		bw.append("\n강력한 보안성능을 자랑합니다.");
		
		// 입출력 닫기
		bw.close();
	}

}
