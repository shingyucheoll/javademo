package java022_lambda.part03;

// 추상메소드 한곳에 몰아넣을수 있나?
@FunctionalInterface
public interface Speakable {
	public void speak(String content);
}
