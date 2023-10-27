package ch11.sec02.exam00;

import java.lang.reflect.Field;

public class ReflectByFieldExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
		// 분석할 클래스 가져오기
		Class class1 = Class.forName("ch11.sec02.exam00.Child");
		
		// 블러온 바이트코드로 부터 검색할 대상이 이번엔 필드
		// 리플렉션으로 불러온 Child클래스의 멤버필드 chtr1의 내용 블러오기
		// Class.getDeclaredField("필드명");
		Field field = class1.getDeclaredField("cstr1");
		
		// cstr1 필드의 시그니쳐(=선언) 살펴보기
		System.out.println("멤버필드 cstr1의 형식 가져오기 : " + field);
		
		// 모든 필드 정보를 가져오기
		// Class.getDeclaredField();
		Class class2 = Class.forName("h11.sec02.exam00.perent");
		Field[] fields2 = class2.getDeclaredFields();
		// 배열의 내용을 화면에 출력하기, 배열을 출력할 때는 for ~ each(for(  :  )) 루프가 최적
		for (Field fieldItem : fields2) {
			System.out.println("Parent 클래스의 모든 필드 변수 정보 출력 : " + fieldItem);
		}
		
		// public 필드만 가져오기
		// Class.getField();
		Class class3 = Class.forName("h11.sec02.exam00.Child");
		Field[] fields3 = class2.getFields();
		// 배열의 내용을 화면에 출력하기, 배열을 출력할 때는 for ~ each(for(  :  )) 루프가 최적
		for (Field field3 : fields3) {
			System.out.println("Child 클래스의 모든 public 필드 변수 정보 출력 : " + field3);
		}
		
	}

}
