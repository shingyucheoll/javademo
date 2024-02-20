package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Java222_Jdbc_procedure {

	private Connection conn;
	private CallableStatement cstmt;

	public Java222_Jdbc_procedure() {

	}

	public void process() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/myxedb";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "{call my_select(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			// In 입력값
			cstmt.setInt(1, 101);

			// Out 반환값 - 변수에 담아서 반환
			cstmt.registerOutParameter(2, Types.VARCHAR); // registerOutParameter 변수로 값을 반환 받았다.
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			System.out.printf("%s %d \n", cstmt.getString(2), cstmt.getInt(3));

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
		new Java222_Jdbc_procedure().process();
	}

}
