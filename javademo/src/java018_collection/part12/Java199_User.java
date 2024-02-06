package java018_collection.part12;
/*
 * 1 와일드 카드(?)를 제공하는 이유
 *   :컬렉션에 저장되는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은
 *    저장할 수 없는 상태였다. 하지만 때로는 기존과 같이 모든 객체들을
 *    저장해야 할때가 있다.
 *    Vector v=new Vector();
 *    v.add(new Integer(20));
 *    v.add(new String("java"));
 *    
 * 
 * 2 와일드 카드의 구성
 *   <?> : 모든 객체자료형에 대한 배치를 의미한다.
 *   <? super 객체자료형> :  명시된 객체자료형이나 객체자료형의 상위
 *              객체들의 배치를 의미한다.
 *   <? extends 객체자료형> : 명시된 객체자료형이나 객체자료형으로 부터
 *              상속받은 하위객체들의 배치를 의미한다.
 */
public class Java199_User {

	public static void main(String[] args) {
		//모든 사람이 산청 가능
		Course.registerCoursel(new Applicant<Person>(new Person()));
		Course.registerCoursel(new Applicant<Worker>(new Worker()));
		Course.registerCoursel(new Applicant<Student>(new Student()));
		Course.registerCoursel(new Applicant<HighStuent>(new HighStuent()));
		Course.registerCoursel(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		//학생만 신청가능 ? extends 가능
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStuent>(new HighStuent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		//Course.registerCourse2(new Applicant<Worker>(new Worker())); 상속이 아니라 불가
		
		//직장및 일반인만 등록가능 ? super가능
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Person>(new Person()));


	}//

}//
