package ch07.sec03.exam02;

public class AnimalExamole {

	public static void main(String[] args) {
		// 자식클래스를 직접 생성 
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		// 부모객체를 생성하고 부모객에게 자식 클래스를 대입
		// 변수의 자동 타입 변환
		Animal animal = null;
		// 자동타입변환 및 재정의된 메소드 호출
		// 강아지 객체를 초기화하는 생성자 Dog()
		// 그 결과 힙에 만들어진 dog객체를 에니멀 변수가 참조한다.
		// 그래서 dog객체가 아니라  animal를 가르키므로 업캐스팅(upcasting)
		animal = new Dog();
		animal.sound();
		// 자동타입변환 및 재정의된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("------------");

		// 메소드의 다형성
		// 
		animalSound(new Dog());  //자동타입변환
		animalSound(new Cat());  //자동타입변환
		 
	}
	// 메인을 포함하는 클래스는 무대 역할을 하므로 어디에서나 호출 할 가능성이 큼
	// public 접근자한으로 설정
	// 위임
	public static void animalSound(Animal animal) {
		animal.sound();		//재정의된 메소드 호출
	}

}
