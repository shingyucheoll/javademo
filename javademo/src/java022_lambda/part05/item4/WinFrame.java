package java022_lambda.part05.item4;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinFrame extends Frame {
	
	public WinFrame() {
		setSize(300, 400);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});
		
		//익명함수로 주어줘도 메소드가 2개라서 람다식으로 표현불가능
//		this.addWindowListener((e)-> windowClosing(e));
	}
	
	

}
