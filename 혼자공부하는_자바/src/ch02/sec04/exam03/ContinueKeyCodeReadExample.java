package ch02.sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		// 키보드값 저장
		int keyCode ;
		boolean isRunning = true;
		
		while(isRunning) {
			// 키를 누르면 키코드 출력
			keyCode = System.in.read() ;
			System.out.println("keyCode : " + keyCode);
			// 반복실행
		}

	}

}