package ch11.sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해 String 값을 저장하는 HashMap 객체 생성
		// HashMap< 키 데이터형식, 값 데이터형식> 형식으로 객체를 생성
		// 엑셀의 워크시트나 디비의 테이블 컬럼주고를 생각하면 됨. 사전이라고 부른다
		// 데이터타입<매개변수형식> 참조변수 = new 데이터타입<매개변수형식>();
		// 테이터타입 : 컬랙션형식
		// <매개변수형식> : 실제 데이터타입에서 사용하는 데이터구조
		// new 데이터타입<매개변수형식> : 메모리에 새로운 방을 만들어라
		// new 데이터타입<매개변수형식>() : 생성자
		HashMap<Key, String> hashMap = new HashMap<Key, String> ();
		
		// 식별키 만들기
		Key newKey = new Key(1);
		// 해시맴에서 테이터 추가
		// HashMap.put(키값, 데이터값);
		// 해시맥에서 데이터 읽기
		// HashMap.gut(키값);
		hashMap.put(newKey, "황진이");
		
		// 식별키 변수(=newKey)로 데이터 읽어오기
		String value1 = hashMap.get(newKey);
		System.out.println("Key1 = " + newKey + ", value1 = " + value1);
		
		// 임시객체를 사용해서 임시로 메모리에 방을 만들고 힙에 접근해보기
		// new Key(2)를 실행하면 new 연산자에 의해 매번 실행될 때 만다 새로운 메모리의 방으 만듬. 
		// 새로운 값(=null)을 가르킨다.
		// 식별키 new Key(2)로 "가을"을 저장함
		hashMap.put(new Key(2),"가을");
		// 저장된 데이터를 읽어오기	
		// 식별키 new Key(2)로 "가을"을 읽어옴
		String value2 = hashMap.get(new Key(2));
		System.out.println("Key2 = " + new Key(2) + ", value2 = " +value2);

	}

}
