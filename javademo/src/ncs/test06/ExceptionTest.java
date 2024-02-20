package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("2~5 사이의 숫자를 입력하세요.");
		num = sc.nextInt();

		sc.close();

		Calculator cc = new Calculator();
		
        try {            
            System.out.println("결과값 : "+cc.getSum(num));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
	}

}
