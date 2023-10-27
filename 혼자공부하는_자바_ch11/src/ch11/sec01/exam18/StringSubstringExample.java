package ch11.sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		String secondNum2 = ssn.substring(7, ssn.length());
		System.out.println(secondNum2);

	}

}
