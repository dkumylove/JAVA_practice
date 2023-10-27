package extra.ch05;

public class Ex2_arrayassingnexample {

	public static void main(String[] args) {
		// 1. 크기가 10인 정수형 배열만들기
		//    데이터 모델에 해당 - Mosel
		int[] num =  new int[10];
		
		// 2.각 배열에는 0~9 값으로 채움
		//   실제 데이터를 처리하는 비지니스로직
		//   Business Logic -0 ConTroller라고부름
		// num = new int[] {};
		for(int i = 0; i < num.length; i++) {
			num[i] = i;
			System.out.println("[" + i + "] = " + num[i]);
		}
		System.out.println("---------");
		// 1~10
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1 ;
			System.out.println("[" + i +"] = " + num[i]);
		}
		System.out.println("---------");
		int count = 0;
		while(count < num.length) {
			System.out.print(num[count] + ", ");
			count++;
		}
		int count1 = 0;
		System.out.println("\n---------");
		while(count1 < num.length) {
			System.out.print("[" + count1 + "]="+ num[count1] + ", ");
			count1++;
		}
		
		// 베열의 인덱스가 배열의 크기보다 -1 작다
		// 그런데 배열의 크기값과 같은 인덱스를 사용하려하면
		// 인덱스 예외가 발생한다.
		//num[num.length] = 8;
		//System.out.println("num[" + num.length + "] = " + num[num.length]);
		
		
		
		// 3. 배열의 내용을 출력
		//   출력예 1, 2, 3, 4, 
		//   Model과 Controller를 이용해 화면에 출력할 내용을 보여줌 - View
		//   MVC(Mode-View-Controller)디자인 패턴 이라고합니다.
				
	}

}
