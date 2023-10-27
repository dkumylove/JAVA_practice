package ex.ch07;

public class Ch07_03_E3_HttpServletExample {

	public static void main(String[] args) {
		method(new Ch07_03_E3_LoginServlet()); //로그인합니다.
		method(new Ch07_03_E3_FileDownloadServlet()); // 파일 다운로드합니다.
	}
	
	public static void method(Ch07_03_E3_HttpServlet servlet) {
		servlet.service();
	}

}
