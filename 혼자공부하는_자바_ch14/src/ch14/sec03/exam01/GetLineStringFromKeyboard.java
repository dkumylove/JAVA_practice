package ch14.sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws IOException {
		// InputStream을 Reader로 변경하고 다시 BufferedReader을 연결
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("입력하세요 : ");
			// 라인 단위로 문자열을 읽음
			String lineStr = br.readLine();
			// q또는 quit를 읽었을 때 whlie 반복문 종료
			if(lineStr.equals("q") || lineStr.equals("quit"))
				break;
			System.out.print("입력된 내용 : " + lineStr);
			System.out.println();
		}

		br.close();
	}

}
