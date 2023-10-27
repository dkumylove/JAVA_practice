package ch06.sec00.String;

public class StringExample1 {

	public static void main(String[] args) {
		//문자열 선어
		String proverd = "A Barking dog"; //nwe 연산자 생략
		String s1; //문자열결합 저장변수
		String s2; //문자교환
		String s3; //부분문자열 구하기
		String s4; //대문자로 교환

		s1 = proverd.concat(" naver Bites!"); 
			// A barking dog + naver Bites!
		s2 = proverd.replace('B', 'b');		  
			// 'B'를 'b'로 고침
		s3 = proverd.substring (2, 5);		  
			// 인덱스 2부터 인덱스 5까지의 부분 문자열을 가져옴(2~4)
		s4 = proverd.toUpperCase();			  
			// 대문자로 변환
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
