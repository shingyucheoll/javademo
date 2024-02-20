package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Java221_Jdbc_procedure {
	
	private Connection conn;
	private CallableStatement cstmt;
	private ResultSet rs;
	
	public Java221_Jdbc_procedure() {
	
	}
	
	public void process() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/myxedb";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "{call pl_emplist(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 20);
			rs = cstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%d %s %d %d\n",
									rs.getInt("employee_id"),
									rs.getString("first_name"),
									rs.getInt("salary"),
									rs.getInt("department_id"));
			}
			
			
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
		new Java221_Jdbc_procedure().process();
	}

}
