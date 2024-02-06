package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java173_stream {
	
	public static void main(String[] args) {
		// 대상이 File일 경우 exception 처리
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("sample.txt"));
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
			
		} finally {
			sc.close();
		}
		
	}

}
