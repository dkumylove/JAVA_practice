package ch06.sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// 객체를 오직 한번만 만들어야한다
		// 꼭 실행해야하는데 여러번 실행되면 안되고 한번만 실행되기를 바랄때 
		// 원래라면 아래와 같이 생성함
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */
		// 하지만 유일 객체 생성을 원하므로 new Singleton() 대신
		// .getInstance();이용
		// 그러면 유일한 객체의 참조 주소를 돌려준다
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
