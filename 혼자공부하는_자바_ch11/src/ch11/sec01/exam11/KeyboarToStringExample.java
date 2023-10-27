package ch11.sec01.exam11;

import java.io.IOException;

public class KeyboarToStringExample {
	public static void main(String[] args) throws IOException {
		// 키보드로부터 입력 받을 최대 글자수
		final int MAX_CHAE_LENGTH = 100;
		
		// 읽은 바이트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[MAX_CHAE_LENGTH];
		
		System.out.println("입력 : ");
		// 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		// System.in.read(저장할 바이트배열)
		// 키보드 입력의 끝은 입력 내용중 "\r\n"로 구분
		
		int readByteNo = System.in.read(bytes);
		
		// 키보드로부터 입력받은 바이트배열을 문자열고 변환
		// new String(바이트배열, 시작인텍스, 변환할 개수)
		// 바이트배열을 -> 문자열로 변환
		// readByteNo-2 : 문자열변환시 \r\n필요없으므로
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		
	}
}
