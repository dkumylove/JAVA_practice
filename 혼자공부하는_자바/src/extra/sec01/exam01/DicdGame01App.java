package extra.sec01.exam01;

public class DicdGame01App {

	public static void main(String[] args) {
		// 주사위 눈금을 얻으려면 난수를 이용합니다.
		// Math.random() 이용 : 0 <= 눈금 < 1 작은실수
		// (int)숫자 : 강제로 정수로 바꿔주세요.
		int num = (int)(Math.random() * 6 ) + 1 ;

		System.out.println("주사위 눈금 : " + num);
		
		// 0이 나오면 f 1이 나오면 t 
		
		
		
		}

}
