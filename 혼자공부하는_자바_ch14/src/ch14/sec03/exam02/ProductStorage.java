package ch14.sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// List 컬렉션 생성
	private List<Product> list = new ArrayList<>();
	// 키보드 입력 Scanner 생성
	private Scanner scanner = new Scanner(System.in);
	// pno 제공 카운터
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.등록    | 2.목록    | 3.종료");
			System.out.println("----------------------------------");
			
			System.out.println("선택 : ");
			// 번호읽기
			String selectNo = scanner.nextLine();
			switch(selectNo) {
				// Product 등록
				case "1" : registerProduct();
					break;
				// 등록된 모든 product 정보 보기
				case "2" : showProduct();
					break;
				// 프로그램 종료
				case "3" : return;
			} // switch 끝
		} // while 끝
	} // showMenu() 끝
	
	public void registerProduct() {
		try {
			Product product = new Product();
			// pno 세팅
			product.setPno(++counter);
			
			System.out.println("상품명 : ");
			// 이름을 읽고 세팅
			product.setName(scanner.nextLine());
			
			System.out.println("가격 : ");
			// 가격을 읽고 세팅
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("재고 : ");
			// 재고를 읽고 세팅
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			// list에  Product저장
			list.add(product);
		} catch(Exception e) {
			System.out.println("등록에러 : "+ e.getMessage());
		}
	} // registerProduct() 끝
	
	public void showProducts() {
		// list에 저장된 모든 Product 정보를 모니터에 출력
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t"
							+ p.getStock());
		}
	} // showProducts() 끝
}
