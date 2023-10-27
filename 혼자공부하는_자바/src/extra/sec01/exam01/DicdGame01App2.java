package extra.sec01.exam01;

public class DicdGame01App2 {

	public static void main(String[] args) {
		
		// Math.random() 이용 : 0 <= 눈금 < 1 작은실수
		// (int)숫자 : 강제로 정수로 바꿔주세요.
		// 0이 나오면 f 1이 나오면 t 
		Boolean stop = false ; // 프로그램을 처음 시작할 때 보통
								// bool 값은 false로 둠
		
		//  Math.random() 이용 : 0 <= 눈금 < 0.999999999난수
		//  Math.random() * 2이용 : 0*2 <= 눈금 < 0.999999999 *2
		// (int)(Math.random() * 2 ) : 난수값보다 작은 정수
		int choice = (int)(Math.random() * 2 );

		System.out.println();{
			if( 1 == choice ) {
				System.out.println("true : " + choice);
			} else {
				System.out.println("false : " + choice);
			}

			
		System.out.println();{
			if(stop) {
				System.out.println("true : ");
			} else {
				System.out.println("false : ");
			}
		}
		}
	}
}
