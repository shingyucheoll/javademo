package java022_lambda.part01;

public class Calculablemp implements Calculable {

	
		@Override
		public void calculate(int x, int y) {
			int result = x* y;
			System.out.printf("result:%d\n", result);
		};
}
