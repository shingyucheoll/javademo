package java013_api;

import java.util.Arrays;
import java.util.Random;

public class Java144_Random {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		Random ran = new Random();
		
		for (int i = 0; i < num.length; i++) {
			//난수 발생
			num[i] = ran.nextInt(10) + 1;
			
			for(int j = 0; j < i; j++) {
				//중복체크
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
		
		Arrays.sort(num); // 오름차순이 기본
		for(int data : num) {
			System.out.printf("%4d", data);
		}
	}

}
