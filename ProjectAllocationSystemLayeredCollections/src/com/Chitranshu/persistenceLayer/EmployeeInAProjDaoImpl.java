package com.Chitranshu.persistenceLayer;

import java.util.Map;
import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;
import com.Chitranshu.database.EmpInAProjDataSource;

public class EmployeeInAProjDaoImpl implements EmployeeInAProjDao {
	
	Map<Project, Set<Employee>> empInAProjMap=EmpInAProjDataSource.getEmpInAProjMap();
	
	@Override
	public Map<Project, Set<Employee>> getEmpInAProjMap(){
		return empInAProjMap;
	}
	
	@Override
	public boolean addEmployeeToProject(Project proj, Employee emp) {
		Project currProj=getProjectOfEmployee(emp);
		if(currProj==null) {
			Set<Employee> empSet=empInAProjMap.get(proj);
			if(empSet.size()<10) {
				empSet.add(emp);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean removeEmployeeFromProject(Project proj, Employee emp) {
		Set<Employee> empSet=empInAProjMap.get(proj);
		if(empSet.contains(emp)) {
			empSet.remove(emp);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean shiftEmployeeToDiffProject(Project destProj, Employee emp) {
		Project srcProj=getProjectOfEmployee(emp);
		if(removeEmployeeFromProject(srcProj, emp)) {
			if(addEmployeeToProject(destProj,emp)) {
				return true;
			}
			else {
				addEmployeeToProject(srcProj,emp);
				return false;
			}
		}
		return false;
		
	}
	
	@Override
	public Set<Employee> getEmployeesInAProject(int projId) {
		for(Project proj:empInAProjMap.keySet()) {
			if(proj.getProjID()==projId)
				return empInAProjMap.get(proj);
		}
		return null;
	}
	
	@Override
	public Project getProjectOfEmployee(Employee emp) {
		for(Project proj:empInAProjMap.keySet()) {
			if(empInAProjMap.get(proj).contains(emp)) {
				return proj;
			}
		}
		return null;
	}
	
}
