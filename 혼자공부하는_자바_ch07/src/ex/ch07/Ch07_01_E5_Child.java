package ex.ch07;

public class Ch07_01_E5_Child extends Ch07_01_E5_Parent {
	private String name;
	
	public  Ch07_01_E5_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public  Ch07_01_E5_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
