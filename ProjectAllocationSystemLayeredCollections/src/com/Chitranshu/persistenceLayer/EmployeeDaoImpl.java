package com.Chitranshu.persistenceLayer;

import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee searchRecord(int empId) {
		Set<Employee> employees=EmployeeDataSource.getEmployeeSet();
		for(Employee emp: employees) {
			if(emp.getEmpId()==empId) {
				return emp;
			}
		}
		return null;
	}
	
	@Override
	public Set<Employee> getAllEmployees() {
		
		return EmployeeDataSource.getEmployeeSet();
	}
	

}
