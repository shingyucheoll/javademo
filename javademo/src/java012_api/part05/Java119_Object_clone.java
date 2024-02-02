package java012_api.part05;

import java.util.Arrays;

public class Java119_Object_clone {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] copy = arr;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));		
		arr[0] = 10;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		
		System.out.println("=============");
		
		int[] arr2 = {1,2,3,4,5};
		int[] copy2 = arr2.clone();   // copy로 받아올 경우엔 다른 주소값 참조
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(copy2));		
		arr2[0] = 10;
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(copy2));

	}

}
