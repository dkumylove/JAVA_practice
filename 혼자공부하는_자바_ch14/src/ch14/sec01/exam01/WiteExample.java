package ch14.sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WiteExample {

	public static void main(String[] args) throws IOException  {
		
		// 출력스트림 최상위 객체(OutputStream)
		// OutputStream : 출력스트림의 최상위 부모로 추상 클래스
		// FileOutputStream : 파일을 다루는 출력스트림의 구현클래스
		// 따라서 FileOutputStream은 OutputStream의 메소드를 모두 가지고있다(상속)
		// 데이터 도착지를 test.db로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("c:/temp/test.db");
		System.out.println("파일 출력스트림 생성");

		// 출력할 데이터를 만든다
		// 세개의 바이트 변수 선언
		byte a = 10;
		byte b = 20;
		byte c = 30;
		System.out.println("데이터준비 완료");
		
		// 위의 바이트 변수를 출력스트립으로 파일을 만듬
		// 1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		System.out.println("데이터를 파일출력스트림에 전송");

		// 현재 파일 출력스트림의 버퍼에 보관중인 데이터를 파일로 출력
		os.flush();
		System.out.println("혹시 남아있는 잔여데이터를 파일스트림에 비움");
		
		//모든 스트림 작업이 끝나면 반드시 공식적으로 닫아야 한다. 안하면 메모리에서 제거되지 않을 수 있다.(메모리 누수)
		os.close();
		System.out.println("작업이 끝났으면 반드시 자원을 닫아주세요");
		
	}

}
