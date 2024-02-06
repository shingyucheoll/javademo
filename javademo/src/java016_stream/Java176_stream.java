package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java176_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
//		boolean chk = file.delete();
//		System.out.println(chk);

//		deleteOnExit() : 시스템이 종료되기 직전에 sample.txt 파일을 삭제
		file.deleteOnExit();

		Scanner sc = null;

		try {
			sc = new Scanner(file);	
			while (sc.hasNextInt()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
