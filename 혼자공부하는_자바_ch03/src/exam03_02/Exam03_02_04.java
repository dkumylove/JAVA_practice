package exam03_02;

public class Exam03_02_04 {

	public static void main(String[] args) {

		int pencils =534;
		int students = 30;
		
		//학생 1명이 가지는 연필의 개숫
		int pencilPerStudent = pencils / students ;
		System.out.println(pencilPerStudent);
		
		//남은 연필의 개수
		int pencilLeft = pencils % students ;
		System.out.println(pencilLeft);
		
	}

}
