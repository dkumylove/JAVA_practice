package extra.ch05;

public class Array학생점수평가2 {

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
		
		String[] subject = new String[2]; // 배열의 선언
		subject = new String[] { "국어", "영어"};
		
		int[] korsco = new int[5];
		korsco = new int[] { 90, 85, 93, 95, 87 };
		int[] engsco = new int[5];
		engsco = new int[] { 80, 75, 83, 92, 86 };
		
		int stusum = 0;
		double stuavg = 0;
		
		int korsum = 0;
		double koravg = 0;
		int kormax = korsco[0]; // 가장 높은 점수
		int kormin = korsco[0]; // 가장 낮은 점수
		int kormaxindex = -1;
		int korminindex = -1;
		
		int engsum = 0;
		double engavg = 0;
		int engmax = engsco[0]; // 가장 높은 점수
		int engmin = engsco[0]; // 가장 낮은 점수
		int engmaxindex = -1;
		int engminindex = -1;
		
		for (int i = 0; i < studentNames.length ; i++) {
			stusum = korsco[i] + engsco[i];
			//stuavg = (double)stusum/subject.length;
			
			System.out.printf("이름 : %s \n점수) 국어: %d점, 영어: %d점\n총합: %d점, 평균: %d점\n" , 
							studentNames[i], korsco[i], engsco[i], stusum, stuavg);
		}
		System.out.println("-------------------------------------------");
	
		
		// 2. 과목별 총점을 구하고 평균점을 구하시오
		

		for (int i = 0; i < korsco.length ; i++) {
			korsum += korsco[i];
			koravg = (double)korsum / korsco.length;
		
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
		
		for (int i = 0; i < engsco.length ; i++) {
			engsum += engsco[i];
			engavg = (double)engsum / engsco.length;
			
		// 가장 높은 점수와 가장 낮은 영 점수를구하시오
		// -1로 두는 이유는 아직 비교하지 않았다는 뜻	
		// 가장 높은 영어점수를 기록한 학생이름은 누구입니니까?	
			if (engmax < engsco[i]) {
				engmax = engsco[i];
				engmaxindex = i ;
			}
		
			if (engmin > engsco[i]) {
				engmin = engsco[i];
				engminindex = i;
			}
		}
		
		
		System.out.println("국어총점 : " + korsum + "점");
		System.out.println("국어평균 : " + koravg + "점");
		System.out.printf("최고점 학생 : %s , 점수 : %d 점 \n", studentNames[kormaxindex], kormax);
		System.out.printf("최저점 학생 : %s , 점수 : %d 점 \n", studentNames[korminindex], kormin);
		System.out.println("-------------------------------------------");	
		System.out.println("영어총점 : " + engsum + "점");
		System.out.println("영어평균 : " + engavg + "점");
		System.out.printf("최고점 학생 : %s , 점수 : %d 점 \n", studentNames[engmaxindex], engmax);
		System.out.printf("최저점 학생 : %s , 점수 : %d 점 \n", studentNames[engminindex], engmin);
	}

}
