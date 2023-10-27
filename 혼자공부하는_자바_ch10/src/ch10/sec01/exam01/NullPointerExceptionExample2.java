package ch10.sec01.exam01;

public class NullPointerExceptionExample2 {
	public String name = "황진이";
	public String addr = "개성";
	public String country = "한국";
	
	public NullPointerExceptionExample2(String name, String addr, String country) {
		this.name = name; 
		this.addr = addr;
		this.country = country;
	}
	
	public String toString() {
		return "이름 : " + this.name + "\n"
				+ "주소 : " + this.addr + "\n"
				+ "국가 : " + this.country + "\n";
	}
	
	public static void main(String[] args) {
//		String data = null;
//		System.out.println(data.toString());
		
		// NullPointerExceptionExample 객체 생성
		NullPointerExceptionExample2 npe = new NullPointerExceptionExample2(
											"홍길동", "울릉도", "대한민국");
		System.out.println(npe.toString());

	}

}
