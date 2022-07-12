package com.Chitranshu.persistenceLayer;

import java.util.Map;
import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;

public interface EmployeeInAProjDao {
	
	Map<Project, Set<Employee>> getEmpInAProjMap();
	
	boolean addEmployeeToProject(Project proj, Employee emp);
	
	boolean removeEmployeeFromProject(Project proj, Employee emp);
	
	boolean shiftEmployeeToDiffProject(Project destProj, Employee emp);
	
	Set<Employee> getEmployeesInAProject(int projId);
	
	Project getProjectOfEmployee(Employee emp);
}
