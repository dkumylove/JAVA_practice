package extra.ch05;

public class Ex3_Stringarrayprintexample {

	public static void main(String[] args) {
		//1. 피자토핑할 변수를 만들기
		String[] t = new String[5];
		
		//2. 초기화를 이용하여 피자 토핑잣을 변수에 대입
		t = new String[]{"pepperoni", "mushrooms", "onions", "sausage", "bacon"};
		
		//3. 피자 토핑변수의 내용을 화면에 출력(데이터 출력 루프사용)
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i]+ " ");
		}
	}

}
