package ch03.sec02.exam08;

public class ComperOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);   //true
		// 소수점이 없는 것을 변환할 때 자동으로
		
		double v4 = 0.1 ;
		float v5 = 0.1F ;
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		// 소수점이 값이 있는 경우 강제 형변환, 소수점 이하를 믿을 수 없다.
	}

} 
