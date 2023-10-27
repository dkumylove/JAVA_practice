package ch14.sec01.exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		// 1. 입력스트림생성
		//  InputStream클래스는 추상클래스
		//  new InputStream() 실행은 불가능, 참조만 가능
		InputStream is = new FileInputStream("c:/temp/test.db");
		
		// 2. 읽어올 데이터가 없을때까지( read() == -1 )
		//   데이터를 읽을 수 있다(read() 호출)
		//   데이터를 가저오기 위해 while반복문 사용
		while(true) {
			int date = is.read();  // 1바이트씩 읽기
			if(date == -1) break;  // 더이상 read할 데이터가 없으면 -1리턴
			System.out.println(date);
		}
		// 3. 데티어를 읽기 처리가 끝났으면 입출력 자원 반납
		is.close();

	}

}
