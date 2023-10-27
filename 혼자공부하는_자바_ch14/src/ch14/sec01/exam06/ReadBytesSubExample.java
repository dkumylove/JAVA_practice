package ch14.sec01.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesSubExample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test3.db");
		
		byte[] bytes = new byte[5];
		
		// 입력스트림 is로부터 받아 3바이트를 읽어서
		// bytes[2], bytes[3], bytes[4]에 각각 저장
		int readByteNum = is.read(bytes, 2, 3);
		// is로부터 더이상 읽어올 데이터가없으면 readByteNum 은 -1 리턴
		if (readByteNum != -1) {
			// 읽어올 데이터가 있으면
			for(int i = 0; i < readByteNum; i++) {
				System.out.println(bytes[i]);
			} // 배열 전체를 익어서 출력한 루프
		}
		// 입력스트림 종료
		is.close();
	}

}
