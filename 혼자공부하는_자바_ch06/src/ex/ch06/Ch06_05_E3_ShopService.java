package ex.ch06;

public class Ch06_05_E3_ShopService {
	//정적필드
	private static Ch06_05_E3_ShopService singleton 
									= new Ch06_05_E3_ShopService();
	
	//생성자
	//private Ch06_05_E3_ShopService() {}
	
	//정적메소드
	static Ch06_05_E3_ShopService getInstance() {
		return singleton;
	}
}
