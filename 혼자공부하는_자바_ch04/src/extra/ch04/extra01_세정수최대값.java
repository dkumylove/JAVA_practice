package extra.ch04;

import java.util.Scanner;

public class extra01_세정수최대값 {

	public static void main(String[] args) {

		System.out.println("[ 출력 ]");
		System.out.println("세 정수의 최대값을 구합니다.");

		Scanner sca = new Scanner(System.in);

		System.out.print("i의 값 : ");
		int i = sca.nextInt();

		System.out.print("j의 값 : ");
		int j = sca.nextInt();

		System.out.print("k의 값 : ");
		int k = sca.nextInt();

		
		
		// 먼저 i>j비교 큰값을 max에 대입
		// max와 k를 비교 큰값을 max에 대입
		// 이렇게 하면 실제 데이터를 보존된다.
//		if (i > j) {
//			max = i;  // i가 j보다 크다
//		} else if (j == i) {
//			max = i;  // i가 j와 같다
//		} else {
//			max = j;  // j가 i보다 크다
//		}
//		
//		if(max > k) {
//			
//		} else if (max == k) {
//			
//		} else {
//			max = k;
//		}
//		System.out.println("최대값은 " + max + "입니다." );

		int max = -1;
		
		if (i > j && i > k) {
			max = i;
		} else if (j > i && j > k) {
			max = j;
		} else {
			max = k;
		}
		System.out.println("최대값은 " + max + "입니다.");
		
		int min = 100;
		if (i < j && i < k) {
			min = i;
		} else if (j < i && j < k) {
			min = j;
		} else {
			min = k;
		}
		System.out.println("최소값은 " + min + "입니다.");

	}

}
