package java012_api.part07;

public class Java122_String {
	
	public static void main(String[] args) {
		String sn = "127.0.0.1:8008";
		System.out.println(sn.indexOf(":"));
		System.out.println("ip:"+sn.substring(0,9));
		System.out.println("port:"+sn.substring(10));
		
		String[] data = sn.split(":");
		System.out.println("ip:"+data[0]);
		System.out.println("port:"+data[1]);
		
		
		
	}

}
