package ch06.sec00.overloding;

public class Ex01OverLoadingExample {
	// 변수가 두개인 이항 덧셈 메소드
	public int add(int x, int y) {
		return x+y;
	}
	
	// 변수가 세게인 삼헝 덧셈 메소드
	public int add1(int x, int y, int z) {
		return x+y+z;
	}
	
	// 변수가 세개인 삼항 덧셉 메소드 단 오버로딩을 이용
	// 오버로딩 : 메소드의 이름이 같고 매개 변수를 데이터형식과 갯수가 다름
	// 리턴값의 리턴 형식은 관계없음
	//   int add(100,200,300), float add(100,200,300)은 오버로딩이 안됨.
	//   똑같은 메소드의 선언부가 같기 때문에 에러가 발생
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
		
	public static void main(String[] args) {
		
		Ex01OverLoadingExample ex01 = new Ex01OverLoadingExample();
		// 100+ 200 = 300계산하는 add(int, int) 이항 메소드
		System.out.println("100+200 = " + ex01.add(100, 200));
	
		//기본방법으로 ( 100 + 200 ) + 300 = 300 + 300 = 600
		System.out.println("100+200+300 = " + ex01.add(ex01.add(100,200), 300));
		
		//새로운 삼항 덧셈 메소드를 이용하면 조금더 간결한 연산이 됨
		System.out.println("100+200+300 = " + ex01.add1(100,200,300));
		
		//메소드오버로딩 적용하면
		System.out.println("100+200+300 = " + ex01.add(100,200,300));
		
		}
	
	

}
