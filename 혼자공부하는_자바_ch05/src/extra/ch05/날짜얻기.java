package extra.ch05;

import java.time.LocalDateTime;

public class 날짜얻기 {

	public static void main(String[] args) {
		// 1. 오늘 날짜를 얻어서 현재 월을 구하시오
		
		// 2. 현재 날짜는 LocalDateTime클래스를 참조하세요
		//    import java.util.LocalDateTime;
		//    ...
		//    현재 날짜는 다음으로
		//    LocalDateTime now = LocalDateTime.now();
		//    현재 월은 다음 매소드로 구합니다.
		//    int month = now.getMonthValue();
		
		// 3. 현재 월에 해당하는 계절을 출력하세요
		//    3,4,5월인 경우 현재 월 + "은 봄입니다."
		//    6,7,8월인 경우 현재 월 + "은 여름입니다."
		//    9,10,11월인 경우 현재 월 + "은 가을입니다."
		//    12,1,2월인 경우 현재 월 + "은 겨울입니다."
		
		// 계절을 상수이름으로 식별하기 쉽게 만든다
		final int SEASON_SPRING = 0;
		final int SEASON_SUMMER = 1;
		final int SEASON_FALL = 2;
		final int SEASON_WINTER = 3;
		
		// 사계절 이름을 배열로 선언 및 초기화
		// seasons 배열 변수 현재 만들어 지면서
		// "봄"/ "여름"/ "가을"/"겨울"의 힙을 바로 가리키고 있다.
		String[] seasons = new String[] {
				"봄", "여름", "가을","겨울"
		} ;
		// 이 가리키는 것을 중지시킨다(가비지 컬렉터 작동
		seasons = null;
		//영어로 출력하기 원해서 새로운 힙 창고에 
		// 새로운(new)String[4]크기의 스트링 배열을 만든다
		// 데이터는 "Spring/ Summer/Fall/Winter"로 초기화를 한다
		// {}안의 초기화 데이터로 배열의 크기를 알수 있다
		seasons = new String[] {
				"Spring", "Summer", "Fall", "Winter"
		} ;
		
		// 오늘 날짜와 시간을 구하기	
		// LocalDateTime이라는 라이브러리가 필요
		// 오늘 날짜 LocalDateTime.now(); 메소드로 구할수 있다
		LocalDateTime today = LocalDateTime.now();
		// 이번달을 얻어보기 int LocalDateTime.getMonthValue()
		int month = today.getMonthValue();
		
				
				
		// 자바 17 부터 적극적으로 권장하는 문자열 표기법
		// 프론트 언어에서는 템픔릿 문자열이라고 부르는 \
		// Multi-Line String
		// 대표적 사용예
		// 멀티라인 문자열은 """ 시작 """ 로 닫습니다,
		String msg = """
				%s월은(는) %s입니다.
				%s월은(는) %s입니다.
			""" ; // 닫는 위치에서 시작함
		// 월에 따라 출력메세지를 만듭니다.
		// msg = msg.formatted(month, seasons[SEASON_FALL], 3, seasons[SEASON_SPRING]);
		
		
		// 달을 이용하여 계절을 판별합니다.
		// 3 <= month <= 5 : 봄 = seasons[EASON_SPRING]
		if(3 <= month && month <= 5) {
			// 월에 따라 출력메세지를 만듭니다.
			msg = msg.formatted(month, seasons[SEASON_SPRING]);
		} else if (6 <= month && month <= 8) {
			//  6 <= month <= 8 여름 = seasons[SEASON_SUMMER]
			msg = msg.formatted(month, seasons[SEASON_SUMMER]);
		} else if (9 <= month && month <= 11) {
			msg = msg.formatted(month, seasons[SEASON_FALL], 0, "안녕");
		} else {
			msg = msg.formatted(month, seasons[SEASON_WINTER]);
		}
			
		// msg 출력문자열을 화면에 출력합니다.
		System.out.println(msg);
		
	}


}
