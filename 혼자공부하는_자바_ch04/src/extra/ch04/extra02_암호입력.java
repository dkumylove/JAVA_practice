package extra.ch04;

import java.util.Scanner;

public class extra02_암호입력 {

	public static void main(String[] args) {
		//반복문
		//키보드로 암호를 입력합니다.
		// ㄱ. 암호를 비교하여 같으면 "암호ok" 출력
		// ㄴ. 암호가 틀리면 "암호가 틀립니다! 올바른 암호를 입력해주세요"출력
		// ㄷ. 암호를 5번 틀리면, "암호를 확인해주세요. 관리자에게 확인해주세요" 출력
		// 더이상 암호를 입력할 수 없도록 합니다.
		
		//스캐너로 입력받기
		Scanner sca = new Scanner(System.in);
		
		System.out.println("*****암호설정*****");
		System.out.print("설정암호 : " );
		String password = sca.nextLine();
		
		System.out.println("*****암호입력*****");
		for(int i = 1 ; i <= 5; i++) {
			System.out.print(i + " 번째 입력 : ");
			String input = sca.nextLine();
			if (input.equals(password)) {
				System.out.println("암호ok");
				break;
			} else if (i< 5){
				System.out.println("암호가 틀렸습니다! 올바른 암호를 입력해주세요.");	
			} else {
				System.out.println("암호를 확인하세요. 관리자에게 확인해 주세요.");
			}
		}
		
		
			
	}

}
