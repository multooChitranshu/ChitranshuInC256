package com.Chitranshu.persistenceLayer;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;

public class ProjectAllocationDaoImpl implements ProjectAllocationDao {

	EmployeeDaoImpl empDaoImpl=new EmployeeDaoImpl();
	ProjectDaoImpl projDaoImpl=new ProjectDaoImpl();
	EmployeeInAProjDaoImpl empInAProjDaoImpl=new EmployeeInAProjDaoImpl();

	@Override
	public boolean allocateProject(int empId, int projId) {
		Employee emp=empDaoImpl.searchRecord(empId);
		Project proj=projDaoImpl.searchRecord(projId);
		
		if(emp!=null && proj!=null) {
			return empInAProjDaoImpl.addEmployeeToProject(proj, emp);
		}
		return false;
	}

	@Override
	public boolean deAllocateProject(int empId, int projID) {
		Employee emp=empDaoImpl.searchRecord(empId);
		Project proj=projDaoImpl.searchRecord(projID);
		if(emp!=null && proj!=null) {
			return empInAProjDaoImpl.removeEmployeeFromProject(proj, emp);
		}
		return false;
	}

	@Override
	public boolean shiftToAProject(int empId, int destProjID) {
		Employee emp=empDaoImpl.searchRecord(empId);
		Project proj=projDaoImpl.searchRecord(destProjID);
		if(emp!=null && proj!=null) {
			return empInAProjDaoImpl.shiftEmployeeToDiffProject(proj, emp);
		}
		return false;
	}
		
	
}
