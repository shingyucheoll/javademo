package java021_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public JdbcTest() {

	}

	public void process() {
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. DB서버 연결
			String url = "jdbc:mysql://127.0.0.1:3306/myxedb";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println(conn);
			
			//3. 쿼리문을 실행을 위한 Statement객체를 생성			
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행 : SELECT - executeQuery() , UPDATE, INSERT, DELETE - executeUpdate()
			 // ResultSet executeQuery(),   int executeUpdate()
			String sql = "SELECT department_id, department_name, manager_id, location_id FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			//5. 쿼리문의 결과 처리
			while(rs.next()) {
				int departmentId = rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int managerId = rs.getInt("manager_id");
				int locationId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", departmentId, departName, managerId, locationId);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}// end process()

}// end class










