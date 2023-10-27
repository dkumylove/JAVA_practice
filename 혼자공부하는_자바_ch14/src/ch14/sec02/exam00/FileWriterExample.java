package ch14.sec02.exam00;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("C:/temp/filedata2.txt");
		
		// 이스케이프문자 \r : 줄의 제일처음으로, \n : 다음줄로
		// 윈도우즈는 \n만해도 다음줄로 가서 줄의 제일체음에 글자가 출력됨
		fileWriter.write("안녕하세요\r\n 자바는 재미있습니다.\r\n");
		fileWriter.append("java is good!");
		fileWriter.append("\r\nbyebye.");
		
		// fileWriter 닫기
		fileWriter.close();

	}

}
