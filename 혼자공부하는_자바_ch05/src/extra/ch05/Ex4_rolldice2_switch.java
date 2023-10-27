package extra.ch05;
import java.util.Random;

public class Ex4_rolldice2_switch {
    public static void main(String[] args) {
		
		//diceCont : 주사위의 눈이 나온빈도횟수
		//diceCont1 : 1번 눈이 나온 횟수
		//diceCont2 : 2번 눈이 나온 횟수
		//diceCont3 : 3번 눈이 나온 횟수
		//diceCont4 : 4번 눈이 나온 횟수
		//diceCont5 : 5번 눈이 나온 횟수
		//diceCont6 : 6번 눈이 나온 횟수		
		
		// 1 주사위의 눈금의 수르 ㄹ기호상수로 정의
		//   나중에 눈금의 수가 변하더라고 프로그램코드를 고칠 필요 없다
		
		final int diceLength = 6; // 변수처럼 보이지만 상수이무로 기호 상수라함
		
		// 2 주사위를 던져 나온 눈의 홋수를 측정할 변수 diceCount를 선언
		//   이 변수는 1의 눈 2의눈... 6의 눈에도 
		//   공통(각주사위의 눈을 얻어내는 방법이 동일)되게 작용하므로 이런 경우 배열이 적격
		
		int[] diceCount = new int[diceLength];
		
		// 3. 각 주사위의 눈을 구하기 위해 주사위를 반복해서 던져야한다. 
		// 똑같은 동작을 반복하므로 반복문이 적격, 
		// 횟수가 정해져 있으무로 for사용
		
		
		for(int i = 0; i < 10; i++) {
			// 4 난수는 Math.random()로 구한다
			// 주사위 눈금은 (int)(Math.random()* diceLength)
			
			int rull = (int)(Math.random()* diceLength);
			
			switch(rull) {
				case 1 :
					diceCount[0]++;
					break;
				case 2 :
					diceCount[1]++;
					break;
				case 3 :
					diceCount[2]++;
					break;
				case 4 :
					diceCount[3]++;
					break;
				case 5 :
					diceCount[4]++;
					break;
				case 6 :
					diceCount[5]++;
					break;	
				default :	
			}
			
		}
		System.out.println("-----------------");
		System.out.println("면     빈도      ");
		System.out.println("-----------------");

		for(int i = 0; i < diceLength; i++) {
			System.out.println(""+ (i+1) + "\t"+ diceCount[i]);
		}
	}

}