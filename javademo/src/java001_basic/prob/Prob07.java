package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		
		int money = 7777;				
		int coin500, coin100, coin50, coin10, coin1;
		
		coin500 = money / 500;
		money = money % (coin500 * 500);
		coin100 = money / 100;
		money = money % (coin100  * 100);
		coin50 = money / 50;
		money = money % (coin50  * 50);
		coin10 = money / 10;
		money = money % (coin10  * 10);
		coin1 = money / 1;
		money = money % (coin1  * 1);
		
		System.out.printf("500원: %d개\n"
				+ "100원: %d개\n"
				+ "50원: %d개\n"
				+ "10원: %d개\n"
				+ "1원: %d개\n",coin500, coin100, coin50, coin10, coin1);
		
		//여기에 작성하시오.
		
		
		
		
				
	}//end main()

}//end class


