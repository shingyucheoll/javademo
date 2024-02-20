package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DepartmentsService {
	DepartmentsDAO dao = null;

	public DepartmentsService() {

	}

	public List<DepartmentsDTO> getDepartmentsList() {
		List<DepartmentsDTO> aList = null;

		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false); // 자동 커밋 해제
			dao = DepartmentsDAO.getInstance();
			aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
		} catch (SQLException ex) {
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
		return aList;
	}// end getDepartmentsList()

	public List<DepartmentsDTO> getSearchList(String search) {
		List<DepartmentsDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false); // 자동 커밋 해제
			dao = DepartmentsDAO.getInstance();
			aList = dao.getSearchMethod(conn, search);
			JdbcTemplate.commit(conn);
		} catch (SQLException ex) {
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}

		return aList;
	}// end getSearchList()

}// end class
