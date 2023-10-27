package ch14.sec03.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// File객체생성
		File dir = new File("C:/temp/images");
		File file1 = new File("C:/temp/file1.txt");
		File file2 = new File("C:/temp/file2.txt");
		File file3 = new File("C:/temp/file3.txt");
		
		// 파일 또는 폴더가 존재하지 않으면 생성
		if(dir.exists() == false) {
			dir.mkdir();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		// C:/temp폴더의 내용 목록을 File배열로 얻음
		File temp = new File("C:/temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("-----------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			// 파일 또는 폴더 정보를 출력
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			} //if else 끝
			System.out.println();
		} // for 끝	
	} // main 끝
}
