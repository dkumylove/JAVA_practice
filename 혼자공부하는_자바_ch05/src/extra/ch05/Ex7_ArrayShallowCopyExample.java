package extra.ch05;

//Shallow copy 얕은 복사// 복사가 아니라 공유이다
public class Ex7_ArrayShallowCopyExample {

	public static void main(String[] args) {
		int[] list = { 10, 20, 30, 40, 50 };
		// 얕은복사를 이용한 배열 요소 복사하기
		int[] numbers = list;
		
		System.out.println("------------------------------------");
		// 원본배열 출력
		for (int number : list) {
			System.out.println(number);
		}
		
		// 복사된 배열출력
		System.out.println("------------------------------------");
		for (int number : numbers) {
			System.out.println(number);
		}

		// list배열과 numbers배열의 서로 같은가 참조비교
		System.out.println("------------------------------------");
		if (list == numbers) {
			System.out.println("list배열과 numbers배열이 완전히 같습니다.");
		} else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
		}
		
		// list배열과 numbers배열 내용을 비교하는 equals()메소드확인
		System.out.println("------------------------------------");
		if (list.equals(numbers)) {
			System.out.println("list배열과 numbers배열이 완전히 같습니다.");
		} else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
		}

		// list배열과 numbers배열 개별 배열요소 비교
		System.out.println("------------------------------------");
		for (int i = 0; i < list.length; i++) {
			if (list[i] == numbers[i]) {
				System.out.println("list와 numbers의 개별요소가 같습니다");
			} else {
				System.out.println("list와 numbers의 개별요소가 다릅니다.");
			}
		}
		// 데이터 객체의 정보의 특징을 toString()해쉬값으로 출력
		// 단위주소 비교, 어떤 변수의 특징을 난수로 만들어 냄
		// 이 해쉬값이 같다면 같음
		// 해쉬코드 원본데이터로 돌아갈수 없음
		System.out.println("------------------------------------");
		System.out.println(list.toString());
		System.out.println(numbers.toString());
		//list = null;
		//System.out.println("------------------------------------");
		//System.out.println(list.toString());
		//System.out.println(numbers.toString());
		
		// 복사복 numbers의 데이값을 데이터요소* 10을 해서 내용을 바꿈
		// list원본에 영햐이 있을지 살펴보자
		System.out.println("------------------------------------");
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = numbers[i] *10;
		}
		
		// numbers배열의 내용이 바뀌었는 확인
		for(int i =0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 원본 list배열의 내용이 바뀌었는지 확인
		System.out.println("-------numbers와 list가 바뀌었는가-----------");
		for(int i =0; i< numbers.length; i++) {
			System.out.println(list[i]);
		}
		//////////////////////////////////////////////////////
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
		///////////////////////////////////////////////////////////
		
		// 얕은 복사는 같은 메모리를 가르킨다.
		// 같은 내용물을 가르킨다
		//
		}
	
	}
}
