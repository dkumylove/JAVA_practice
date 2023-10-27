package ch14.sec02.exam00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileEncodingConverterExample {

	public static void main(String[] args) throws IOException {
		// 1. 변환할 인코딩 파일을 읽어옴
		//  바이트스트림으로 읽어와서 내용물이 텍스트이므로 
		//  문자스트림리더로 설정하여 버퍼리터로 최종읽기 속도 높인다.
		FileInputStream fis = new FileInputStream("C:/temp/StreamData.txt");
		InputStreamReader reader = new InputStreamReader(fis, "EUC-KR");
		BufferedReader br = new BufferedReader(reader); 
		// InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
		
		// 2. 읽어온 파일을 인코딩변환하여 저장할 파일 출력을 만듬
		FileOutputStream fos = new FileOutputStream("C:/temp/StreamData1-UTF-8.txt");
		OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(writer); 
		
		// 3. 입력스트림으로부터 파일의 내용을 한글자씩 일거오면서 출력스트림에 쓰기 작업
		//  파일을 읽어오는 반복문 필요
		// 속도를 좀더 올리기 위해 BufferedReader와 별개로 작은 메모리공간(버퍼)를 추가로 만듬
		final int BUFFER_SIZE = 1024;
		char[] chars = new char[BUFFER_SIZE];
		
		while(true) {
			int readCharNum = br.read(chars);
			if (readCharNum != -1) {
				bw.write(chars);
			} else {
				break;
			}
		}
		
		// 4. 변환이 끝나면 입출력 닫기
		bw.flush();
		
		br.close();
		bw.close();
		
		reader.close();
		writer.close();
		
		fis.close();
		fos.close();
		
	}

}
