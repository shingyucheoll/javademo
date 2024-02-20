package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java219_Jdbc_procedure {

	private Connection conn;
	private CallableStatement cstmt; // java.sql

	public Java219_Jdbc_procedure() {
		// TODO Auto-generated constructor stub
	}
	
	public void process() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/mywork";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "{call pro_pltest(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "message");  // 첫번째 ? 에 message
			cstmt.execute();
			System.out.println("program end");
			
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cstmt.close();
			conn.close();	
		} 
	}

	public static void main(String[] args) throws SQLException {
		
		new Java219_Jdbc_procedure().process();

	}

}
