package extra.ch04;

public class Ch04_02_E3 {

	public static void main(String[] args) {
		// 1. 루푸가 필요한가? while(true)
		// 2. 난수가 필요한가? (int)(Math.random() * 6 ) + 1
		// 3. 두 주사위의 눈내용을 출력하세요
		// 4. 게임을 끝내는 조건은 무엇인가? (num1+num1)==5, break
		
		while(true) {
			int num1 = (int)(Math.random() * 6 ) + 1 ;
			int num2 = (int)(Math.random() * 6 ) + 1 ;
			
			int sum = num1 + num2 ;
			// System.out.println("( "+ num1 +", "+ num2 +")" );
			System.out.printf("(%d, %d) \n", num1, num2);
			if( sum == 5) {
				break;
			}
		}
		
	}
}
