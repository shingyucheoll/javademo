package java016_stream;

import java.io.IOException;
import java.io.InputStream;

/*
 *  carriage return : 줄의 처음으로 이동 (13)
 *  line feed : 다음 줄로 이동 (10)
 */

public class Java168_stream {

	public static void main(String[] args) {

		int data;

		System.out.println("데이터 입력 : ");

		InputStream is = System.in;

		try {
//			data = is.read();
//			System.out.println(data);	// 97
//			data = is.read();			
//			System.out.println(data);	// 13    	
//			data = is.read();
//			System.out.println(data);	// 10
			
			// read를 전부 뽑고 싶을땐 while문으로 리턴하기
			
			while ((data = is.read()) != 13) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
