package ch11.sec01.exam05;

public class SmartPhone {
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	
	// toString() 재정의
	@Override
	public String toString() {
		//return company +  ", " + os;
		return "[company : " + this.company +  ", os : " + this.os + "]";
	}
}
