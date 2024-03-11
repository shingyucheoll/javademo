package java022_lambda.part03;

//데이터 처리부
public class Person {
	public void action1(Workable workable) {
		workable.work("홍길동", "프로그램");
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}
}
