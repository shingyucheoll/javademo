package ncs.test07;



public class StudentTest {

	public static void main(String[] args) {
		

//		아래와 같이 3개의 Student Object를 생성 하여 프로그램을 동작 시킨다.
//		name age height weight number major
//		홍길순 25 171 81 201401 영어영문학
//		한사랑 23 183 72 201402 건축학
//		임꺽정 26 175 65 201403 체육학
		
		Student[] obj = new Student[3];
		obj[0] = new Student("홍길순",25,171,81,"201401","영어영문학");
		obj[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		obj[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
		
//		배열에 있는 객체 정보를 모두 toString() 으로 출력 한다. – for 문을 이용 할 것
		for (Student st : obj) {
			System.out.println(st.toString());
		}

	}

}
