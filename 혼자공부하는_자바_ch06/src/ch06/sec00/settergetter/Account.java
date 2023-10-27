package ch06.sec00.settergetter;

public class Account {
	private int regNumber; // 계좌번호
	private String name;   // 소유자
	private int balance;   // 잔고
	
	//생성자 : 클래스와 이름이 같음, 안에서 사용할 매개변수(용도를 알수 있게 정해야함)
	Account() {
	
	}
	Account(int regNumber) {
		this.regNumber = regNumber;
	}
	//속성메소드 저의
	//public 
	// 읽기만가능
	int getRegNumber(){
		return regNumber;
	}
	
	//public 
	String getName() {
		return name;
	}
	//public 
	// 수정가능
	void setName(String name) {
		this.name = name;
	}
	
	//public 
	int getBalance() {
		return balance;
	}
	//public 
	void setBalance(int balance) {
		// 만약 입금액이 < 0 이면 입금액을 0으로 설정
		if(balance <0 ) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

}
