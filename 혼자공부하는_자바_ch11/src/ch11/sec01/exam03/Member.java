package ch11.sec01.exam03;

public class Member {
public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
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
	
	// id가 동일한 문자열인 경우 같은 해시코드를 리턴
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
