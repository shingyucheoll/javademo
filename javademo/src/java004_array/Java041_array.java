package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		int [] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
//		sum = sum + num[0];
//		sum = sum + num[1];
//		sum = sum + num[2];
//		sum = sum + num[3];
//		System.out.println(sum);  // 45
		
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		System.out.println(sum);
		

	}

}
