package java004_array;

public class Java042_array {

	public static void main(String[] args) {
		int [] num = new int[] {22, 3, 8, 12};
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				odd += num[i];
			}else {
				even += num[i];
			}
		}
		System.out.printf("홀수합 : %d\n짝수합 : %d",odd,even);

	}

}
