package com.Chitranshu.persistenceLayer;

import java.util.Set;

import com.Chitranshu.bean.Employee;

public interface EmployeeDao {
	Employee searchRecord(int empId);
	Set<Employee> getAllEmployees();
}
