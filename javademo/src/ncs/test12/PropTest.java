package ncs.test12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

//명시한 사용 데이터를 prop 에 기록한다.
// fileSave() 메소드를 호출한다.

// fileOpen() 메소드를 호출한다.

//fileSave() 메소드를 구현한다.
//fileOpen() 메소드를 구현한다.

//1 = apple, 1200원, 3개
//2 = banana, 2500원, 2개
//3 = grape, 4500원, 5개
//4 = orange, 800원, 10개
//5 = melon, 5000원, 2개

public class PropTest {

	public static void main(String[] args) {

		Properties prop = new Properties();

		prop.put("1","apple,1200,3");
		prop.put("2", "banana,2500,2");
		prop.put("3", "grape,4500,5");
		prop.put("4", "orange,800,10");
		prop.put("5", "melon,5000,2");

		fileSave(prop);
		fileOpen(prop);

	}

	public static void fileSave(Properties p) {

		try {
			p.storeToXML(new FileOutputStream("data.xml"), "과일정보");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileOpen(Properties p) {

		try {
			p.loadFromXML(new FileInputStream("data.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> keyList = new ArrayList<>();
		Enumeration<?> keys = p.propertyNames();

		while (keys.hasMoreElements())
			keyList.add((String) keys.nextElement());

		keyList.sort(null);

		Fruit[] fruit = new Fruit[keyList.size()];

		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
			String value = p.getProperty(key);
			String[] temp = value.split(",");
			fruit[i] = new Fruit(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
		}

		for (int i = 0; i < fruit.length; i++)
			System.out.println((i + 1) + " = " + fruit[i].toString());
	}

}
