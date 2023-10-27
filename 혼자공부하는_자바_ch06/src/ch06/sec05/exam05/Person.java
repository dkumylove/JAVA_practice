package ch06.sec05.exam05;

public class Person {
	final String nation = "Korea";
	final String ssn; //nation과 다르게 실체화 되지 않앗기 때문에 
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public Person(String nation, String ssn, String name) {
		//this.nation = nation;
		this.ssn = ssn;
		this.name =name;
	}
	
}
