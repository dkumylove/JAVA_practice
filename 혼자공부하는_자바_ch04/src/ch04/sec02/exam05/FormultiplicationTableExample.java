package ch04.sec02.exam05;

public class FormultiplicationTableExample {

	public static void main(String[] args) {

		// 단을 의미하는 변수 m
		// 각단의 열을 의미하는 n
		// 예 ) m*n 2*1=2

		// int m = 2; //2단
		// int n = 1; // 단의 열을 의미

		// int result = m*n ; //2=2*1

		// n = n+1 // n++
		// result = m * n++ ; // 위의 식을 이렇게 변경함

		// System.out.println(m + "x" + n + "=" + result);

		// 변수는 가장 가까운 위치에 선언하는 것이 좋다.
		// 지역변수는 블럭 밖에서 사용하지 않는다면
		// 블럭안에서 사용하는 것이 좋다

		// 각단의 반복
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단 ***");
			// 각단의 열 반복
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
	}

}
