package java005_method;

public class Java062_method {

	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);

	}
	public static void process(int num) {
//		System.out.printf("%d는 %s입니다.\n", data, process(data) ? "짝수" : "홀수");
		System.out.println();
		if (num > 0) {
			System.out.printf("%d는 양수입니다.\n",num);
		}else if (num == 0){
			System.out.printf("%d는 0입니다.\n",num);
		}else {
			System.out.printf("%d는 음수입니다.\n",num);
		}
		
	}

}
