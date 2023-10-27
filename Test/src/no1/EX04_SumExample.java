package no1;

public class EX04_SumExample {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 10 == 10) {
				System.out.println(i);
			} else {
				System.out.print(i + " + ");
			}
			if(i % 10 == 0 ) {
				System.out.println("-> " + sum);
				sum = 0;
			}
			
		}
	
	}
}
