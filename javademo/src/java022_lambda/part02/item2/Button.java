package java022_lambda.part02.item2;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener{
		void onclick();
	}
	
	// 맴버변수
	private ClickListener clickListener;
	
	// 데이터 처리부
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		
		
	}
	
	public void click() {
		this.clickListener.onclick();
	}

}
