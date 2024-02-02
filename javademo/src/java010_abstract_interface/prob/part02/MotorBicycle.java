package java010_abstract_interface.prob.part02;

public class MotorBicycle implements IBicycle, IMotor {
    // 멤버변수 추가
    int id;
    String brand;
    
    public MotorBicycle() {
		// TODO Auto-generated constructor stub
	}
    
    public MotorBicycle(int id, String brand) {	
		this.id = id;
		this.brand = brand;
	}
    
    
//    [출력결과]
//    		 * ID : 900
//    		 * Brand : Yamaha
//    		 * Frame Size : 16
//    		 * Motor Size : 100
//    		 * ## 모터 start!!
//    		 * ## 모터 stop!!
	// IBicycle에 있는 추상 메소드를 구현하세요
    public void prtInfo() {
    	System.out.println("ID : " + id);
    	System.out.println("Brand : " + brand);
    	System.out.println("Frame Size : " +FrameSize_M);
    	System.out.println("Motor Size : " +Motor_Size_Large);
    	
        //여기
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void start() {
    	System.out.println("## 모터 start!!");
       //여기
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void stop() {
        //여기
    	System.out.println("## 모터 stop!!");
    }

}
