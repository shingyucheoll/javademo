package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class MemService {
	public MemDAO dao;
	
	public MemService() {
	
	}
	
	public int getDelete(int num) {
		int chk =0;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);
			dao = MemDAO.getInstance();
			chk = dao.deleteMethod(conn, num);
			JdbcTemplate.commit(conn); // 커밋
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
		
		
		return chk;
	}
	
	public int getUpdate(HashMap<String, Object> map) {
		int chk =0;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false); // 자동 커밋 해제
			dao = MemDAO.getInstance();
			chk = dao.updateMethod(conn, map);
			JdbcTemplate.commit(conn); // 커밋
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
		
		return chk;
	}//end getUpdate()
	
	
	public int getInsert(MemDTO dto) {
		int chk =0;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);
			dao = MemDAO.getInstance();
			chk = dao.insertMethod(conn, dto);
			JdbcTemplate.commit(conn); // 커밋
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		return chk;
	}
	
	public List<MemDTO> getMemList(){
		List<MemDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);
			dao = MemDAO.getInstance();
			aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(conn);
		}
		
		
		return aList;
	}// end getMemList
	
}
