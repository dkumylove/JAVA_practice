package ch14.sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// 기본 스트림생성
		String oringnalFilePath1 = 
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 버퍼 보조 스트림 연결
		String oringnalFilePath2 = 
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// FileInputStream,FileOutputStream을 이용한 복사 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");

		// BufferedInputStream, BufferedOutputStream을 이용한 복사 시간 측정
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용하지 때 : \t\t" + BufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		// 시작 시간 저장
		long start = System.nanoTime();
		// [파일복사] 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		// 끝 시간 저장
		long end = System.nanoTime();
		
		// 복사에 걸린 시간 리턴
		return (end-start);
	}
}
