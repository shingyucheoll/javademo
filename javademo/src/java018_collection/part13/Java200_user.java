package java018_collection.part13;

public class Java200_user {

	public static void main(String[] args) {
		FruitBox<Orange> fOrange = new FruitBox<Orange>();
		fOrange.store(new Orange());
		openAndAllBox(fOrange);
		
		FruitBox<Apple> fApple = new FruitBox<Apple>();
		fApple.store(new Apple());
		openAndAllBox(fApple);
		
		FruitBox<Fruit> fFruit = new FruitBox<Fruit>();
		fFruit.store(new Fruit());
		openAndAllBox(fFruit);
		
		FruitBox<Seoul> fSeoul = new FruitBox<Seoul>();
		fSeoul.store(new Seoul());
		openAndAllBox(fSeoul);
		
		openAndExtendBox(fFruit);
		openAndExtendBox(fApple);
		openAndExtendBox(fOrange);
//		openAndExtendBox(fSeoul);
		
		openAndSuperBox(fFruit);
//		openAndSuperBox(fApple);
//		openAndSuperBox(fOrange);
		openAndSuperBox(fSeoul);

	}
	
	public static void openAndAllBox(FruitBox<?> param) {
		System.out.println(param.pullout());
				
	}
	
	public static void openAndExtendBox(FruitBox<? extends Fruit> param) {
		param.pullout().showYou();		
	}
	
	public static void openAndSuperBox(FruitBox<? super Fruit> param) {
		Object obj = param.pullout();
		Seoul f = (Seoul)obj;
		f.showYou();
	}
	

}
