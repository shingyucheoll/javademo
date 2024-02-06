package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
//		File file = new File("temp");
		File file = new File("Parent/child");
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		if(!file.isDirectory()) {
//			file.mkdir();  // 현재 위치에 temp 폴더 생성 , 하나만 생성 가능
			file.mkdirs(); // 생성할 폴더가 한개 이상일 경우 mkdirs(); 
			System.out.println(file.isDirectory()); // true 폴더생성   - 실시간 반영 안되니 폴더 누르고 F5
			System.out.println(file.isFile());		// 
		}

		
	}

}
