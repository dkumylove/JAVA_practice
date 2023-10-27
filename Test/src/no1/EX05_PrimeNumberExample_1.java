package no1;

public class EX05_PrimeNumberExample_1 {

	public static void main(String[] args) {
		
		// 소수 : 1과 자기 자신만 약수로 같는 수 = 약수의 수 2
		// 1~50까지 출력 변수 i,  i를 나눌 변수 j 
		// 약수개수구하기 : i를 j로 나누어 나머지가 0일때 약수 1개
		
		// 1~50까지 출력
		for(int i = 1; i <= 50; i++) {
			// 약수 변수
			int count = 0;
			
			// i를 나눌 j
			for(int j = 1; j <= i; j++) {
				
				// i를 j로 나눈 나머지가 0 일때 약수 1 증가
				if(i % j == 0) {
					count++;
				}
			}
			// 약수가 2개일때의 i를 출력
			if(count == 2) {
				System.out.print(i + ", ");
			}
		}
	}
}
