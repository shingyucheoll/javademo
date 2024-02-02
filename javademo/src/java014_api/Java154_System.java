package java014_api;

import java.text.SimpleDateFormat;

public class Java154_System {

	public static void main(String[] args) {
		// 하루는 86400초
		System.out.println(60 * 60 * 24);
		
		// currentTimeMillis() : 1970.1.1부터 초단위로 
		// 누적한 값을 밀리세컨드로 리턴
		// 밀리초(millisecond, ms)는 천분의 1초(1/1000)를 의미
		long curr = System.currentTimeMillis();
		System.out.println(curr);
								// HH : 24, hh : 12
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dataTime = sdf.format(curr);
		System.out.println(dataTime);
		
	}

}
