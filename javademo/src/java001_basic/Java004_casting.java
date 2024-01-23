package java001_basic;
/*
 * 명시적 (강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생한다. 데이터 손실이 발생할 수 있음.
 * double d = 100.04;
 * long l = (long)d;  // 명시적 형변환
 * int i = (int)l;    // 명시적 형변환
 * 
 * 묵시적 (자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생한다.
 * int i = 100;
 * long l = i;    // 자동 형변환
 * double d = l;  // 자동 형변환
 * 
*/public class Java004_casting {
// ctrl + shift + F 자동정렬
	public static void main(String[] args) {

		
		byte bNum = 2; // -128 ~ 127
		short sNum = 32767; // -32,768 ~ 32,767
		int xNum = 5; // -2,147,483,648 ~ 2,147,483,647
		long lNum = 6L; // L or l -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F; // F or f
		char cData = 'a';	
		
		System.out.println(cData);
		
		cData = 97;                   // char 'a' = 97, 'A' = 65, '0' = 48
		System.out.println(cData);
		
		for (int i = 65; i < 101; i++) {		// ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcd	
			System.out.print((char)i);
		}
		


		// 형변환 ( casting ) : 명시적, 묵시적 형변환
		// 명시적 (강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생한다.
		// 묵시적 (자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생한다.
		float tNum = (float)2.6;		
		// 명시적 형변환
		// float tNum = (float)2.6;  -> double 을 float으로 변환  //  데이터 손실이 발생할 수 있음.
		System.out.println("tNum : "+tNum);
		
		long gNum = 7; 
		// 묵시적 형변환
		// int -> long으로 변환 
		System.out.println("gNum : "+gNum);
		
		byte data = (byte)128;        // 128이면 -최대값부터 시작함 (byte)135 = -121 
		System.out.println(data);
		
		
		

	}

}
