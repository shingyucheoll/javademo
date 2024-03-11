package java022_lambda.part02.item2;

// 매개변수가 없는 람다식
public class Lambdamain {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onclick() {
				System.out.println("OK 버튼을 클릭했습니다");
				
			}
		});

		btnOk.click();
		
		
		Button btnYes = new Button();
		btnYes.setClickListener(() -> System.out.println("YES 버튼을 클릭했습니다"));
		btnYes.click();
		
		
		Button btnNo = new Button();
		btnNo.setClickListener(() -> System.out.println("NO 버튼을 클릭했습니다"));
		btnNo.click();
	}//main

}
