package ncs.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {

		Random ran = new Random();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(ran.nextInt(100));
		}

		System.out.print("정렬전 : ");
		display(list);

		System.out.println();
		list.sort(new Decending());

		System.out.print("정렬후 : ");
		display(list);

	}

	public static void display(List list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
