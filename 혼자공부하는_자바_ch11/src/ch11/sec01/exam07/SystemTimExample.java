package ch11.sec01.exam07;

public class SystemTimExample {

	public static void main(String[] args) {
		// 시작 시간 읽기
		long time1 = System.nanoTime();
		
		
		// 층정할 알고리즘
		// 1 ~ 1_000_000까지 합
		// 누적합 변수
		int sum = 0;
		for(int i = 1; i <=1_000_000; i++) {
			sum =+ i;
		}
		
		// 끝 시간 읽기
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 1_000_000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다."); 
		
	}

}
