package java022_lambda.part05.item1;

//정적 메소드 정적 인터페이스
public class LambdaMain {

	public static void main(String[] args) {
		
		Person person = new Person();		
		person.action((x,y) -> x+y);
		
		// 정적 메소드
		// 람다식
		person.action((x,y) -> Computer.staticMethid(x, y));
		// 정적 메소드 참조
		person.action(Computer :: staticMethid );
		
		//인스턴스(instance) 메소드인 경우 
		Computer computer = new Computer();	
		//람다식
		person.action((x,y) -> computer.instanceMethod(x, y));
		//인스턴스 메소드 참조 인데 잘안쓰니깐 쓰지마
		person.action(computer :: instanceMethod );
		
		
		
//		Computer computer = new Computer();		
//		Computer.staticMethid(10, 4);
//		
//		computer.instanceMethod(10, 4);
		
		
		

	}// end main

}// end class
