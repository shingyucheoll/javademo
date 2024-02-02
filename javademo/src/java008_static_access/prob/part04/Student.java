package java008_static_access.prob.part04;

/*
-name:String
-kor:int
-mat:int
-eng:int
+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter
+toString():String
+getTotal():int                 <---- kor+eng+mat 를 리턴
+getAvg():double             <---- getTotal()를 3으로 나누어서 평균을 구한후 리턴
+getGrade():char              <---- getAvg()를 이용해서 A,B,C,D,F학점을 구해서 리턴
*/

public class Student {

	String name;
	int kor, mat, eng;

	public Student() {

	}

	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

//	+toString():String
//	+getTotal():int                 <---- kor+eng+mat 를 리턴
//	+getAvg():double             <---- getTotal()를 3으로 나누어서 평균을 구한후 리턴
//	+getGrade():char              <---- getAvg()를 이용해서 A,B,C,D,F학점을 구해서 리턴

	
	// [출력] 홍길동의 점수는 258 이며, 평균은 86.0이고 학점은 B입니다
	@Override
	public String toString() {

		return String.format("%s의 점수는 %d 이며, 평균은 %.1f이고 학점은 %c입니다\n", name, getTotal(), getAvg(), getGrade());
	}
	
	public int getTotal() {
		return kor + eng + mat;
	}
	
	public double getAvg() {
		return (getTotal() / 3);
	}
	
	public char getGrade() {
		double x = getAvg();		
		return x >= 90 ? 'A' : x >= 80 ? 'B' : x >= 70 ? 'C' : 'D';
	}

}
