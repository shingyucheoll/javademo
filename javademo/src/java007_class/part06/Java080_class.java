package java007_class.part06;

public class Java080_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		cal.addValue(4, 8, 12);
		cal.addValue(1.2f, 4.5f);   // double인데 float으로 자동형변환 되어 작동 가능
		cal.addValue(1.2, 4.5d);   // double인데 float으로 자동형변환 되어 작동 가능
		cal.addValue(1.2, 4.5);   // double인데 float으로 자동형변환 되어 작동 가능

	}

}
