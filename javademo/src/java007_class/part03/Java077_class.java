package java007_class.part03;

public class Java077_class {

	public static void main(String[] args) {
		
		
		Calc[] nfo = new Calc[3];
		nfo[0] = new Calc(10,3,'+');
		nfo[1] = new Calc(3,2,'-');
		nfo[2] = new Calc(5,4,'*');
		
		for(int i = 0; i < nfo.length; i++) {
			System.out.println(nfo[i].toString());
		}
		
		
		
//		
//		Calc sum = new Calc(10,3,'+');
//		Calc difference = new Calc(3,2,'-');
//		Calc product = new Calc(5,4,'*');
//		
//		System.out.println(sum.toString());
//		System.out.println(difference.toString());
//		System.out.println(product.toString());

	}

}
