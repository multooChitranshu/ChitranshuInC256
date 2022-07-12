package com.Chitranshu.serviceLayer;

import java.util.Map;
import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;

public interface ProjectAllocationService {
	
	Employee getEmployeebyID(int empID);
	Project getProjectbyID(int empID);
	Set<Project> getAllProjects();
	Set<Employee> getAllEmployees();
	Map<Project, Set<Employee>> getEmpInAProjMap();
	boolean allocateProject(int empId, int projID);
	boolean deAllocateProject(int empId, int projID);
	boolean shiftToAProject(int empId, int projID);
	
}
