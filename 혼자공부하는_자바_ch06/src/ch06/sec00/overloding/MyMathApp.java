package ch06.sec00.overloding;

public class MyMathApp {

	public static void main(String[] args) {
		//MyMath형식의 myMath객체를 메로리에 만듦
		MyMath myMath = new MyMath();
		System.out.println("10*10 = " +myMath.square(10));
		System.out.println("10.0*10.0 = " + myMath.square(10.0));
		System.out.println();
		
		//MyMath형식의 myMath1객체를 메로리에 만듦
		MyMath myMath1 = new MyMath();
		System.out.println("10*10 = " +myMath1.square(10));
		System.out.println("10.0*10.0 = " + myMath1.square(10.0));
		System.out.println();
		
		if(myMath == myMath1) {
			System.out.println("myMath객체와 myMath1 객체는 서로 같은 객체입니다.");
		} else {
			System.out.println("myMath객체와 myMath1 객체는 서로 다른 객체입니다.");
		}
		
	}

}
