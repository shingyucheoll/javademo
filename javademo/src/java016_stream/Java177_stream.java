package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java177_stream {

	public static void main(String[] args) {
		File file = new File("test.txt");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("prgram end");

	}

}
