package java004_array;

import java.util.Arrays;

public class Java039_array {

	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;

		int[] arr;
		arr = new int[3]; // 4btye 3칸 array가 생성됨?
//		int[] arr = { 90, 80, 40 };  처음 초기화때 지정 가능하다.
		
		
//		int[] arr = new int[] {90, 80, 60};
		arr[0] = ko;
		arr[1] = en;
		arr[2] = jp;

		

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
//		배열의 길이로 for문 돌리기  ->  arr의 index는 0부터 시작 , length는 1부터 시작
		for (int i = 0; i < arr.length; i++) {        
			System.out.println(arr[i]);
		}

//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr));

	}

}
