package ch11.sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 보통 매개변수로 데이터를 넘길때 일반적인 부모클래스(주로 Object) 타입으로 작업
	// 매개변수의 형식을 검사함
	// 논리합 논리곱등에서 사용하는 short circut 기법
	@Override // Object클래스의 equals메소드를 꼭 제정의하여 사용
	public boolean equals(Object obj) {
		// 매개값이 Member 타입인지 확인
		if(obj instanceof Member) {
			// Member 타입으로 강제타입 변환하고 id 필드 값이 통일한지 검사후
			// 통일하면 true를 리턴
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		// 매개값이 Member타이이 아니거나 id필드값이 다른 경우 false를 리턴
		return false; 
	}
	
}
