package ch06.sec00.settergetter;

public class AccountExample {

	public static void main(String[] args) {
		
		// 톰의 계정을 하나 만든
		Account tomAccount = new Account();
		tomAccount.setName("Tom");
		tomAccount.setBalance(100_000);
		System.out.println("이름은 "+ tomAccount.getName() 
						   + ", 통장잔고는 " + tomAccount.getBalance()+"입니다.");
		
		// 제인의 계정을 하나 만듬
		Account janeAccount = new Account();
		janeAccount.setName("Jene");
		janeAccount.setBalance(1_000_000);
		System.out.println("이름은 "+ janeAccount.getName() 
						   + ", 통장잔고는 " + janeAccount.getBalance()+"입니다.");
	
		// 리리의 계정 만들기
		// 매개변수가 하나인 Account 생성자 메소드로 Account객체 초기화하는 장면
		Account liliAccount = new Account(100010001);
		liliAccount.setName("lili");
		liliAccount.setBalance(1_000_000);
		System.out.println("계좌번호는 " + liliAccount.getRegNumber()
						   + ", 이름은 "+ liliAccount.getName() 
						   + ", 통장잔고는 " + liliAccount.getBalance()+"입니다.");
		
	}

}
