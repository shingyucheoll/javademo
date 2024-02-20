package java021_jdbc.part02;

import java.util.List;

public class DepartmentsController {
	private DepartmentsService service;
	
	public DepartmentsController() {
	   service = new DepartmentsService();
	}
	
	public List<DepartmentsDTO> listAllProcess(){
		return service.getDepartmentsList();
	}//end listAllProcess()
	
	public List<DepartmentsDTO> listSearchProcess(String search){
		return service.getSearchList(search);
	}//end listSearchProcess()

}//end class
