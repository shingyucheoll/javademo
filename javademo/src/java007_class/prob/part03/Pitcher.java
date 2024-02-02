package java007_class.prob.part03;

public class Pitcher {
	String name;// 이름
	int ini;// 투구이닝
	int run;// 자책점
	double era;// 방어율
	
	public Pitcher(String name, int ini, int run, double era) {
		this.name = name;
		this.ini = ini;
		this.run = run;
		this.era = era;
		
	}

	// 생성자를 구현하시오

	
	public String toString() {
		// 이름 투구이닝 자책점 방어율 순으로 출력할 메소드 구현하시오.
		
		
		return name + "\t\t" + ini + "\t\t" + run + "\t\t" + era;
	}// end toString()
}// end class Pitcher
