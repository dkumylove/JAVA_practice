package ch14.sec01.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesSubExample {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("c:/temp/test3.db");
		
		byte[] bytes = { 10, 20, 30, 40, 50};

		os.write(bytes, 1, 3);  // 1번인테스부터 시작, 3개를 출력
		
		// 잔여데이터 출력해서 버퍼비우기
		os.flush();
		
		// 다 사용 스트림 반납
		os.close();
	}

}
