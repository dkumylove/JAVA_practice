package extra.ch05;

public class Ex5_arrayforeachexample2 {

	public static void main(String[] args) {
		// 1. 5명의 학생의 이름을 변수(배열)에 저장
		// 2. 저장된 학생의 이름들을 출력
		// System.out.println(); 사용
		// 3. for~each 구문을 사용
		// 데이터 학생이름
		// 황진이, 영희, 홍길동, 무지개, 가을

		String[] stuName = new String[] { 
						"황진이", "영희", "홍길동", "무지개", "가을" };

		System.out.println("---for~each 방식 반복문---");
		for (String name : stuName) {
			System.out.println(name);
		}

		System.out.println("--단순반복형 for문--");
		for (int i = 0; i < stuName.length; i++) {
			System.out.println(stuName[i]);
		}
	}
}
