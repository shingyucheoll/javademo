package java009_inheritance.part9;

/* 
[출력결과]
삼성          SHV-E250S     200000
삼성          SHV-E160S     180000
아이폰        A1586 	      250000         ///
아이폰        A1524 	      220000
LG         LG-F700L 	  190000         ///
LG         LG-F650L 	  180000
***************************************************
삼성         SHV-E250S     200000   010-2534-2532    SK
아이폰        A1586         250000   010-2532-5902    LG
LG          LG-F650L      180000   010-7280-5283     KT
아이폰        A1524         220000   010-2259-3052     LG
*/

public class Java101_inheritance {

	public static void main(String[] args) {

		HandPhone[] hp = new HandPhone[6];

		hp[0] = new HandPhone("삼성", "SHV-E250S", 200000);
		hp[1] = new HandPhone("삼성", "SHV-E160S", 180000);
		hp[2] = new HandPhone("아이폰", "A1586", 250000);
		hp[3] = new HandPhone("아이폰", "A1524", 220000);
		hp[4] = new HandPhone("LG", "LG-F700L", 190000);
		hp[5] = new HandPhone("LG", "LG-F650L", 180000);
		
		for(HandPhone nPhone : hp) {
			System.out.println(nPhone.toString());
		}
		
		System.out.println("******************************************");
		
		SmartPhone[] sp = new SmartPhone[6];
		sp[0] = new SmartPhone("삼성", "SHV-E250S", 200000, "010-2534-2532", "SK");
		sp[1] = new SmartPhone("삼성", "SHV-E160S", 180000);
		sp[2] = new SmartPhone("아이폰", "A1586", 250000, "010-2532-5902", "LG");
		sp[3] = new SmartPhone("아이폰", "A1524", 220000, "010-2259-3052", "LG");
		sp[4] = new SmartPhone("LG", "LG-F700L", 190000);
		sp[5] = new SmartPhone("LG", "LG-F650L", 180000, "010-7280-5283", "KT");
		
		
		for(SmartPhone sPhone : sp) {
			if(sPhone.getNumber() != null) {
				System.out.println(sPhone.toString());
				
			}			
		}
		
		System.out.println("******************************************");
		for(SmartPhone sPhone : sp) {
			System.out.println(sPhone.hptoString());
		}
		
		

	}

}
