package ex.ch06;

public class Ch06_04_E3_MemberService {
	//필드
	String id;
	String password;
	
	//생성자
	Ch06_04_E3_MemberService(){
		this.id = "hong";
		this.password = "12345";
	}
	
	//메소드
	boolean login(String id, String password){
		if(id.equals(this.id) && password.equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id){
		System.out.println("로그아웃 되었습니다.");
	}
}
