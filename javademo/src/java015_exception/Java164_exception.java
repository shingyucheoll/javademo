package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java164_exception {

	public static void main(String[] args) {

		File file = new File("sample.txt");
		System.out.println(file);

		FileReader fr = null;
		
		// FileNotFoundException은 checked exception이다.
		// 반드시 try ~ catch ~ finally(예외처리)를 한다.

		try {
			fr = new FileReader(file);
			System.out.println((char)fr.read()); //  FileReader에서 read는 문자 하나만 아스키코드로 읽어온다. 
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//

}
