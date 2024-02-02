package java015_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java163_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] data = new int[2];

		for (int i = 0; i < data.length; i++) {
			data[i] = inputData(sc, i);
			sum += data[i];
			
		}
		System.out.println("배열 요소 총합 " + sum);
		sc.close();

	}//

	private static int inputData(Scanner sc, int index) {
		// 숫자 2개입력 받은걸 int로 바꿔서 합구하기
		int num;
		
		while(true) {
			try {
			System.out.printf("%d번째 정수를 입력:",index);
			num = sc.nextInt();
			break;
			} catch (InputMismatchException ex) {
				System.out.println("정수를 입력하세요.");
				System.out.println(sc.next()); 
				sc.next();
				
			}
		}
		
		
		return num;
	}

}
