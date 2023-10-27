package ch14.sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// 바이트 기반 출력 스트림을 생성하고 DataOutputStream보조 스크림 연결
		FileOutputStream fos = new FileOutputStream("C:/temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 기본타입 값 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		dos.flush();
		
		// 출력 스트림 닫기
		dos.close();
		
		// 바이트 기반 입력스트림을 생성하고 DataInputStream보조 스크림 연결
		FileInputStream fis = new FileInputStream("C:/temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++) {
			// 기본 타입 값 읽기
			String name = dis.readUTF();
			double score = dis.readDouble(); 
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		
	}
}
