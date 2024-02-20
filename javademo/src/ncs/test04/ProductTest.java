package ncs.test04;

import java.util.Scanner;

//상품명 : 갤럭시 s7
//가격 : 563500 원
//수량 : 3 개
//총 구매 가격 : 1690500 원

// main 함수 안에서 Product
// 객체 초기값을 키보드로 입력
// 받아 초기화 생성하고, 필드
// 값을 초회해서 계산하고 출력
// 한다.


public class ProductTest {

	public static void main(String[] args) {
		
		String name;
		int price, quantity;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품명을 입력하세요 \t");
		name = sc.nextLine();
		System.out.println("가격을 입력하세요 \t");
		price = sc.nextInt();
		System.out.println("수량을 입력하세요 \t");
		quantity = sc.nextInt();
		
//		sc.close();
		
		Product duct = new Product(name,price,quantity);
		System.out.println(duct.information());
		
				
				

	}

}
