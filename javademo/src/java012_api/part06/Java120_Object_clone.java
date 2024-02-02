package java012_api.part06;

import java.util.Arrays;

public class Java120_Object_clone {

	public static void main(String[] args) {
		Rect[] rect = new Rect[3];
		rect[0] = new Rect(2, 5);
		rect[1] = new Rect(1, 4);
		rect[2] = new Rect(3, 2);

		System.out.println(Arrays.toString(rect)); // 배열갯수만큼 print
		for (Rect r : rect) {
			System.out.println(r.getArea());
		}

		Rect[] copy = rect.clone();
		for (int i = 0; i < copy.length; i++) {
			copy[i] = copy[i].clone();
		}

		rect[0] = new Rect(2, 6);
		System.out.println(Arrays.toString(rect));

		System.out.println(Arrays.toString(copy)); // rect와 주소값이 같다.
		for (Rect r : copy) {
			System.out.println(r.getArea());
		}

	}

}
