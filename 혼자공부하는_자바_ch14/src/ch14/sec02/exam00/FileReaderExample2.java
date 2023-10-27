package ch14.sec02.exam00;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) throws IOException {
		// FileReader 사용예제
		// FileReader : 파일에 있는 내용을 문자방식으로 읽어온다
		FileReader fileReader = new FileReader("C:/temp/filedata.txt");

		// 한글자 읽어오기
		int ch;
		// read()가 한글자를 리턴할때 정수값으로 리턴 주의
		
		// 1. FileReader로부터 한글자를 읽어온다
		//  ch = fileReader.read() 
		// 2. ch 변수가 -1과 같으면 파일의 끝, 아니면 계속 루프 한글자 읽어온다
		// 3. 루푸를 계속돌려념 ch != -1이면 된다.
		// 4. 위의 두 식을 합치면 ((ch = fileReader.read()) != -1)
		while((ch = fileReader.read()) != -1) {
			// 실제 처리하고 싶음 알고리즘, 여기선 그냥 화면에 출력
			// 입력받은 결과가 int형이므로 문자형으로 바꿀려면 (char)형으로 형변환 필요
			System.out.print((char)ch);	
		} // 파일처림 while 끝
		
		// fileReader 닫기
		fileReader.close();
	} // main 끝

}
