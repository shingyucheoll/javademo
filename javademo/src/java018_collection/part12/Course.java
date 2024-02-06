package java018_collection.part12;

public class Course {
	public static void registerCoursel(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이(가) Coursel을 등록함");
		
	}
	
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이(가) Coursel을 등록함");
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이(가) Coursel을 등록함");
	}
	
	
}


