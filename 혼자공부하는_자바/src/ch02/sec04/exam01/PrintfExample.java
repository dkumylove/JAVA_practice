package ch02.sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123 ;
		System.out.printf("상품의 가격 : %d원 \n", value);
		System.out.printf("상품의 가격 : %6d원 \n", value);
		System.out.printf("상품의 가격 : %-6d원 \n", value);
		System.out.printf("상품의 가격 : %06d원 \n", value);
		System.out.printf("상품의 가격 : %02d원 \n", value);
		System.out.println("---------------");

		
		double value2 = 123.12 ;
		System.out.printf("상품의 가격 : %f원 \n", value2);
		System.out.printf("상품의 가격 : %7.3f원 \n", value2);
		System.out.printf("상품의 가격 : %8.3f원 \n", value2);
		System.out.printf("상품의 가격 : %-7.3f원 \n", value2);
		System.out.printf("상품의 가격 : %07.3f원 \n", value2);
		System.out.println("---------------");

		
		double area = 3.14159 * 10 * 10 ;
		System.out.printf("반지름이 %d인 원의 넒이 : %10.2f\n", 10, area);
		System.out.println("---------------");

		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		System.out.println("---------------");

		System.out.printf("1st: %1$03.2f, 2nd: %2$010.2f\n", 100f, 200.00);
		System.out.printf("1st: %2$03.2f, 2nd: %1$010.2f\n", 100f, 200.00);
		System.out.printf("1st: %2$03d, 2nd: %1$010.2f\n", 100f, (int)200.00);
		
	}

}
