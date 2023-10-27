package ch04.sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		//float를 이용한 반복문
		//초기값 자리에 float
		//조건식float
		//증감식이 float 다른 차이없음
		//하지만 루프변수로 안쓰는 것이 좋다.
		// 소수점 아래를 정확하지 않기 때문에 
		// 실수형 타입은 사용하지 않는 것이 좋음
		//float는 루프카운트로 사용시 믿을 수없음
		for(float x = 0.1f; x<= 1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
