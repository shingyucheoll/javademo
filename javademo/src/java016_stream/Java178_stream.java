package java016_stream;

import java.io.File;

public class Java178_stream {

	public static void main(String[] args) {

		// 016_stream/a/b/ 안에 red.txt test.txt
		File file = new File("src/java016_stream/a");
		// System.out.println(file.listFiles()[0]);
		//file.delete(); // 이렇겐 안되는듯?
		deleteFileList(file);

	}// main

	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		System.out.println(fileAll.length);

		if (fileAll.length != 0) {
			for (File file : fileAll) {
				System.out.println(file);
				if (file.isFile()) {
					file.delete(); //파일 삭제

				} else {
					deleteFileList(file);
				}
			} // end for
			System.out.println("Remove File:" + srcFile.getPath());
			srcFile.delete(); // 현재 폴더 삭제(a,b)

		} // deleteFileList
	}

}
