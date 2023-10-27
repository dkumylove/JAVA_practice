package extra.ch04;

public class Ch04_02_E5_6 {

	public static void main(String[] args) {
		for(int i = 1 ; i < 5 ; i++) {
			for(int j = 1 ; j <= i  ; j++ ) {
				System.out.print("*");
				if(i == j) {
					System.out.println();
				}
			}
			
		}
		
		
		for(int i = 1 ; i < 5 ; i++) {
			for(int j = 4 ; j > 0  ; j-- ) {				
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
