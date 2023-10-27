package extra.ch05;

public class Array학생점수평가_1 {

	public static void main(String[] args) {
		// 학생 5명이 있습니다
		// "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동"
		// 각 학생의 국어 점수는 다음과 같습니다.
		// 홍길동 : 90점
		// 홍이동 : 85점
		// 홍삼동 : 93점
		// 홍사동 : 95점
		// 홍오동 : 87점
		// 이 학생들이 성적을 관리하는 관리 프로그램을 만들려고 합니다.

		// 1. 학생의 리스트를 대표 변수를 이용하여 학생의 이름을 출력하세요.
		String[] studentNames = new String[5]; // 배열의 선언
		studentNames = new String[] { "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };
		
		int[] korsco = new int[5];
		korsco = new int[] { 90, 85, 93, 95, 87 };
		
		int korsum = 0;
		int koravg = 0;
		int kormax = korsco[0]; // 가장 높은 점수
		int kormin = korsco[0]; // 가장 낮은 점수
		int kormaxindex = -1;
		int korminindex = -1;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("이름 : " + studentNames[i] + ", 국어점수 : " + korsco[i]);
		}
		System.out.println("-------------------------------");
	
		
		// 2. 국어과목의 총점을 구하고 평균점을 구하시오
		

		for (int i = 0; i < 5; i++) {
			korsum += korsco[i];
			koravg = korsum / korsco.length;
		
		// 가장 높은 점수와 가장 낮은 국어 점수를구하시오
		// -1로 두는 이유는 아직 비교하지 않았다는 뜻	
		// 가장 높은 국어점수를 기록한 학생이름은 누구입니니까?	
			if (kormax < korsco[i]) {
				kormax = korsco[i];
				kormaxindex = i ;
			}
		
			if (kormin > korsco[i]) {
				kormin = korsco[i];
				korminindex = i;
			}
		}
		
		// 최고점수 출력
		String msg = """
		총점 : $sum점
		평균 : $avg점
		최고점수 :  $maxScore점
		최고점수 학생 : $maxStudent
		최저점수 : $minScore점
		최저점수 학생 : $minStudent
		""";	
				
		msg = msg.replace("$sum", "" + korsum ) 
				// "" + korsum == String.valueOf(korsum)
			.replace("$avg", "" + koravg )
			.replace("$maxScore", "" + kormax )
			.replace("$maxStudent", "" + studentNames[kormaxindex])
			.replace("$minScore", "" + kormin)
			.replace("$minStudent", "" + studentNames[korminindex]);
				
		System.out.println(msg);
		
		System.out.println("-------------------------------");				
		System.out.println("국어총점 : " + korsum + "점");
		System.out.println("국어평균 : " + koravg + "점");
		System.out.printf("최고점 학생 : %s , 점수 : %d 점 \n", studentNames[kormaxindex], kormax);
		System.out.printf("최저점 학생 : %s , 점수 : %d 점 \n", studentNames[korminindex], kormin);		

	}

}
