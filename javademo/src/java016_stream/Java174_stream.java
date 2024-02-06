package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Java174_stream {

	public static void main(String[] args) {
		
		File file = new File("song.txt");
		System.out.println(file.isFile());	// isFile() 파일 유무 

		
		RandomAccessFile raf = null;
		
		String stn = new String("Maron 5 - Daylight, Sunday Moring\r\n");
		
		try {							// rw 읽고 쓰기 read write	
			raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer());  // getFilePointer -> 파일 커서 위치의 글 갯수
			// raf.length() = song.txt 파일의 총 길이를 리턴
			long size = raf.length();
			System.out.println("size = "+size);
			
			raf.seek(size);
			System.out.println(raf.getFilePointer());
			
//			raf.write(stn);  // write는 int값 String으로 넣어줘야함
//			raf.writeUTF(stn);  //  #이 들어간다. 
			raf.writeBytes(stn);  // UTF보단 Bytes로 사용
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
