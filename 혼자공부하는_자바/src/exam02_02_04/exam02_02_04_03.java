package exam02_02_04;

import java.util.Scanner;

public class exam02_02_04_03 {

	public static void main(String[] args) {
		// 입력장치(Scanner) 객체 형성
		Scanner scanner = new Scanner(System.in);
	
		// 사용자 정보입력화면
		//system.out.print ([ 필수정보입력]) ;
		//		1. 이름:
		//		2. 주민번호 앞 6자리:
		//		3. 전화번호:
		
		System.out.println("[ 필수 정보 입력 ]");	
		
				
		System.out.print("1. 이름 : " );
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: "  );
		String ssnNumber = scanner.nextLine();
		
		System.out.print("3. 전화번호 : ");
		String hp = scanner.nextLine();
		
		System.out.println();
		// 입력내용 출력화면
		//		[ 입력내용 ]
		//		홍길동
		//		123456
		//		010-123-4567
		System.out.println("[ 입력한 내용 ]");	
		
		System.out.println(name);
		
		System.out.println(ssnNumber);
		
		System.out.println(hp);
		
	}

}
