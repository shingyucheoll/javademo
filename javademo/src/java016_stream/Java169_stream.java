package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Java169_stream {

	public static void main(String[] args) {

		// byte stream
		InputStream is = System.in;

		// byte stream 과 string stream 연결
		InputStreamReader ir = new InputStreamReader(is);

		// 문자스트림
		BufferedReader br = new BufferedReader(ir);

		System.out.println("데이터 입력 : ");
		int data;

		try {

			while ((data = br.read()) != 13) {
				System.out.println((char) data);
			}

			// read()는 숫자로 읽어오기때문에, 읽어온 값을 (char)로 바꿔서 출력하기.
		} catch (IOException e) { //
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
