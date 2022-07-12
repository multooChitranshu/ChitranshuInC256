package com.Chitranshu.database;

import java.util.HashSet;
import java.util.Set;

import com.Chitranshu.bean.Employee;

public class EmployeeDataSource {

	private static Set<Employee> employeeSet=new HashSet<Employee>();
	static {
		employeeSet.add(new Employee(101, "AAAA", "Associate", "IT", 35000));
		employeeSet.add(new Employee(102, "BBBBB", "Executive", "Sales", 15000));
		employeeSet.add(new Employee(103, "CCCC", "Manager", "Sales", 95000));
		employeeSet.add(new Employee(104, "DDDD", "Sr. Manager", "IT", 175000));
		employeeSet.add(new Employee(105, "EEEE", "Software Engg", "IT", 100));
		employeeSet.add(new Employee(106, "FFFF", "Sr. Manager", "IT", 175000));
		employeeSet.add(new Employee(107, "GGGG", "Sr. Software Engg", "IT", 115000));
		employeeSet.add(new Employee(108, "HHHH", "Data Analyst", "IT", 75000));
		employeeSet.add(new Employee(109, "IIII", "ML Engineer", "IT", 275000));
		employeeSet.add(new Employee(110, "JJJJ", "Sr. Manager", "IT", 175000));
		employeeSet.add(new Employee(111, "KKKK", "SDE Intern", "IT", 10));
		employeeSet.add(new Employee(112, "LLLL", "Tech ops Engg", "IT", 55000));		
	}
	public static Set<Employee> getEmployeeSet() {
		return employeeSet;
	}
	public static void setEmployeeSet(Set<Employee> employeeSet) {
		EmployeeDataSource.employeeSet = employeeSet;
	}

}