package ncs.test06;

public class Calculator {

	int data;
	double sum;

	public Calculator() {

	}

	public Calculator(int data) {
		this.data = data;
	}

	public double getSum(int data) throws InvalidException {

		if (data > 5 || data < 2) {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}

		for (int i = 1; i <= data; i++) {
			sum += i;
		}

		return sum;
	}

}
