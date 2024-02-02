package java009_inheritance.prob.part04;



class Health {
	
	String name; // 이름
	double height; // 신장
	double weight; // 몸무게

	Health(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public void prn() {
		System.out.printf("%s님의 키 %d , 몸무게 %d 입니다.\n", name, height, weight);
	}
}// end Health



