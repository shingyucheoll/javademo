package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;

public class MemController {
	private MemService service;
	
	public MemController() {
		service = new MemService();
	}
	
	public int deleteProcess(int num) {
		return service.getDelete(num);
	}
	
	
	public int updateProcess(HashMap<String, Object> map) {
		return service.getUpdate(map);
	}
	
	public int insertProcess(MemDTO dto) {
		return service.getInsert(dto);
	}
	
	
	public List<MemDTO> listProcess(){		
		return service.getMemList();
	}
	
}
	
