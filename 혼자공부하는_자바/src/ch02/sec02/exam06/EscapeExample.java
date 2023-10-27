package ch02.sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		String greeting = "안녕하세요\n \'Hello\' \t \t \"Hi!\" ";
		System.out.println(greeting);
		
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
