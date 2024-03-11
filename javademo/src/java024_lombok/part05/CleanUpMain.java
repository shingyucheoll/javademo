package java024_lombok.part05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import lombok.Cleanup;

public class CleanUpMain {

	
	
	public static void main(String[] args) throws IOException {
//		processClose();
//		processResource();
		processCleanUp();

	}
	
	/*
	 * @Cleanup (자동 리소스 관리)
	     try-with-resource 구문과 비슷한 효과를 가진다. 
	     구문이 종료될 때 AutoCloseable 인터페이스의 close()가 호출되는 try-with-resource와 
	     달리 Scope가 종료될 때 close()가 호출된다.
	     @Cleanup코드 실행 경로가 현재 범위를 벗어나기 전에 지정된 리소스가 자동으로 정리되도록 하는 데 사용할 수 있습니다 . 
	     @Cleanup다음과 같은 주석 으로 지역 변수 선언에 주석을 달아 이를 수행합니다 .
	     
	     //https://projectlombok.org/features/Cleanup

	 */

	private static void processCleanUp() throws IOException {
		@Cleanup
		InputStream is = System.in; // byte스트림
		@Cleanup
		InputStreamReader ir = new InputStreamReader(is); // 문자스트림을 이어준다.
		@Cleanup
		BufferedReader br = new BufferedReader(ir);
		System.out.print("input : ");
		String line = br.readLine();
		System.out.println(line);
		
	}

	private static void processResource() throws IOException {
		try (InputStream is = System.in;
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(ir)) {
			System.out.print("input : ");
			String line = br.readLine();
			System.out.println(line);

		}
//		System.out.println(br.readLine());

	}

	public static void processClose() throws IOException {
		InputStream is = System.in; // byte스트림
		InputStreamReader ir = new InputStreamReader(is); // 문자스트림을 이어준다.
		BufferedReader br = new BufferedReader(ir);
		System.out.print("input : ");
		String line = br.readLine();
		System.out.println(line);
		br.close();
		ir.close();
		is.close();
	}

}
