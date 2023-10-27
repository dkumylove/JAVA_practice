package ch14.sec01.exam05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesExample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test2.db");
		
		// 일정크기만큼 한번에 읽어 속도를 높이는 버퍼 설정
		// 버퍼이름 bytes
		byte[] bytes = new byte[100]; // 길이 100인 배열 선언
		
		// 파일처리
		while(true) {
			// 파일에서 데이터를 읽어서 bytes배열 변수에 넣어라
			// 그리고 읽은 갯수는 readByNum 변수에 대입
			int readByteNum = is.read(bytes);
			
			// 데이터를 더이상 읽을수 없다면 while루프를 빠져나가야 하므로
			if(readByteNum == -1) break;
			// 파일로부터 읽은 데이터 처리
			// 지금은 그냥 화명에 출력
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(bytes[i]);
			}
			
		}
		// 입력스트림 닫기
		is.close();
	}

}
