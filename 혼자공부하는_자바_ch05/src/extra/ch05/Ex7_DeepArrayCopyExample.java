package extra.ch05;

public class Ex7_DeepArrayCopyExample {

	public static void main(String[] args) {
		// 원본배열
		int[] list = { 10, 20, 30, 40, 50 };
		
		// 복사본 배열
		// 깊은 복사
		// 1. 공간을 확보해야함
		// 2. 복사할 원복과 크기와 타입이 같아야함
		//    new 배열타입[원본의 배열크기] 으로 공간확보 필요
		// 3. 루프를 통해 원본의 개별요소를 복사복의 개별요소에 저장
		int[] numbers = new int[list.length];
		
		// 원본의 갯수만큼 복사
		for(int i = 0; i < list.length; i++) {
			numbers[i] = list[i];
		}
		
		//1> 원본과 복사본이 같은가
		// 원본배열 문자열 toString() 출력
		System.out.println(list.toString());
		
		// 복사배열 문자열 toString() 출력
		System.out.println(numbers.toString());
		
		// 2> 비교연산자를 사용하여 정확하게 비교
		if(list == numbers) {
			System.out.println("list == numbers");
		} else {
			System.out.println("list != numbers");
		}
		
		// 3> 두 배열의 내용을 출력
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("--------");
		for(int i = 0; i < list.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 4> 복사본(numbers)의 배열요소를 고치면 원본의 변화가 있는가?
		System.out.println("==========");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		// 변경된 복사본(numbers) 내용 출력
		for(int i = 0; i < list.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 원본(list)의 배열요소가 전부 0으로 바뀌었는가?
		System.out.println("--------");
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}	
		
	}

}
