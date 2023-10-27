package ex.ch07;

public class Ch07_01_E5_Parent {
	public String nation;
	
	public Ch07_01_E5_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Ch07_01_E5_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
