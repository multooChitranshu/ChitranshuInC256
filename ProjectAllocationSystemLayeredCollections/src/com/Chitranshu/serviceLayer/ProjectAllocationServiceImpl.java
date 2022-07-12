package com.Chitranshu.serviceLayer;

import java.util.Map;
import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;
import com.Chitranshu.persistenceLayer.*;

public class ProjectAllocationServiceImpl implements ProjectAllocationService {

	ProjectAllocationDao projectAllocDao=new ProjectAllocationDaoImpl();
	EmployeeInAProjDao empInAProjDao=new EmployeeInAProjDaoImpl();
	EmployeeDao empDao=new EmployeeDaoImpl();
	ProjectDao projectDao=new ProjectDaoImpl();
	@Override
	public boolean allocateProject(int empId, int projID) {
		return projectAllocDao.allocateProject(empId, projID); 
	}

	@Override
	public boolean deAllocateProject(int empId, int projID) {
		return projectAllocDao.deAllocateProject(empId, projID);
	}

	@Override
	public boolean shiftToAProject(int empId, int projID) {
		return projectAllocDao.shiftToAProject(empId, projID);
	}

	@Override
	public Map<Project, Set<Employee>> getEmpInAProjMap(){
		return empInAProjDao.getEmpInAProjMap();
	}

	@Override
	public Set<Project> getAllProjects() {
		return projectDao.getAllProjects();
	}

	@Override
	public Set<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}

	@Override
	public Employee getEmployeebyID(int empID) {
		return empDao.searchRecord(empID);
	}

	@Override
	public Project getProjectbyID(int empID) {
		return projectDao.searchRecord(empID);
	}
	

}
