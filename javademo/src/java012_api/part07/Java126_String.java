package java012_api.part07;

public class Java126_String {

	public static void main(String[] args) {
		
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
		

	}
	
	public static void display(String str) {
//		System.out.println(str.indexOf("-")+1);
//		System.out.println(str.charAt(str.indexOf("-")+1));
//		String gender = str.indexOf("-")+1 == 1 || 3 ? "남자" : "여자";
		String name = (str.split(","))[0];
		
		
		if(str.charAt(str.indexOf("-")+1) == '1' || str.charAt(str.indexOf("-")+1) == '3') {
			System.out.println(name + "의 성별은 남성입니다.");
		}else if(str.charAt(str.indexOf("-")+1) == '2' || str.charAt(str.indexOf("-")+1) == '4'){			
			System.out.println(name + "의 성별은 여성입니다.");
		}else {
			System.out.println(name + "의 성별은 외계인입니다.");
		}
		
	}

}
