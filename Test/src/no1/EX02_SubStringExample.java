package no1;

public class EX02_SubStringExample {

	public static void main(String[] args) {
		// 문자열
		String msg = "I love JAVA."; 
		
		// 찾을 문자열
		String findString = "love";
		
		// 문자열의 시작점
		int subStartPos = msg.indexOf(findString); 
		
		// 문장열의 끝점(시작점의 자리수 + 찾는 배열의 길이)
		int subEndPos = subStartPos + findString.length();
		
		// 문자열 뽑아내기(시작점, 끝점)
		System.out.println(msg.substring(subStartPos, subEndPos));
		
	}

}
