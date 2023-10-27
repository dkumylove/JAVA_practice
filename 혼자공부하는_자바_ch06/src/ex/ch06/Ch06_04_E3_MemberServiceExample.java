package ex.ch06;

public class Ch06_04_E3_MemberServiceExample {

	public static void main(String[] args) {
		Ch06_04_E3_MemberService memberService = new Ch06_04_E3_MemberService();
		
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
