package ex.ch06;

public class Ch06_05_E3_ShopServiceExample {

	public static void main(String[] args) {
		Ch06_05_E3_ShopService shop1 = Ch06_05_E3_ShopService.getInstance();
		Ch06_05_E3_ShopService shop2 = Ch06_05_E3_ShopService.getInstance();
		
		if( shop1 == shop2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
