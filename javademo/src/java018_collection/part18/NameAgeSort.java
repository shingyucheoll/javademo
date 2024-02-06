package java018_collection.part18;

import java.util.Comparator;

public class NameAgeSort implements Comparator<Person> {

	// name으로 오름차순  age내림차순
	@Override
	public int compare(Person o1, Person o2) {
		System.out.printf("%s %s %d\n",o1.getName(),o2.getName() ,o1.getName().compareTo(o2.getName()));
		
		
		
		//if(o1.getName().compareTo(o2.getName())==0) {
		if(o1.getName().equals(o2.getName())) {
			return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge())) ;
		}else {
			return o1.getName().compareTo(o2.getName());
		}


	}

}
