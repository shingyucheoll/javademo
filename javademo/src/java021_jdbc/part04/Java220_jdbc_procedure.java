package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java220_jdbc_procedure {

	private Connection conn;
	private CallableStatement cstmt;

	public Java220_jdbc_procedure() {

	}

	public void process() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/mywork";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "{call pro_mem_inmode(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "손연재");
			cstmt.setInt(2, 35);
			cstmt.setString(3, "평창");
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
		new Java220_jdbc_procedure().process();
	}

}
