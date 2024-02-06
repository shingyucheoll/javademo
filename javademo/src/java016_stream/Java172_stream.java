package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java172_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());	//
		System.out.println(file.isFile());	// 
		System.out.println(file.length());	// 길이, 공백도 포함

		FileWriter fw = null;
		
		try {									// mode의 값이 true면 append (누적) , false면 update
			fw = new FileWriter(file, false);  	// 생략시 default = false  초기화 후 작성 
			fw.write("java\n"); 	// buffer
			fw.flush();				// buffer에 저장된 문자열을 sample.txt로 보내고 buffer비우기
			
			fw.write(new char[] {'s','p','r','i','n','g'});
			fw.flush();
			
			fw.write("jsp\n");
			fw.flush();
			
			fw.write(97+"\n");	// 유니코드 a
			fw.flush();
			
			fw.write(new char[] {'s','p','r','i','n','g'},3, 2);  // 3 인덱스부터 시작해서 2개를 뽑아온다.
			fw.close();		// fw.close() 를 주게 되면 닫아버린다 이 뒤의 내용은 저장되지 않는다,
			
//			fw.write("end");  // java.io.IOException: Stream closed
//			fw.flush();
//			
			
			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}
