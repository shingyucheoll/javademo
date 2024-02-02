package java013_api;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Java139_Math {

	public static void main(String[] args) {
		int[] num = new int[5];	//1부터 10까지
		
		
		for(int i = 0; i < num.length; i++) {
			// 난수 발생
			num[i] = (int) Math.floor(Math.random() * 10) + 1;
			
			for(int j=0; j < i; j++) {
				//중복 체크
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int data : num) {
			System.out.printf("%4d", data);
		}
		System.out.println();
		
		Arrays.sort(num);	// 오름차순
		
		for(int data : num) {
			System.out.printf("%4d", data);
		}
		
		
		
		
	}

}
