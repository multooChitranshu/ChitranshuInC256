package com.Chitranshu.database;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;

public class EmpInAProjDataSource {
	
	private static Map<Project, Set<Employee>> empInAProjMap = new HashMap<>();
	static {

		Set<Employee> employeeSet1=new HashSet<>();
		Project p=new Project(701,"P1");
		employeeSet1.add(new Employee(101, "AAAA", "Associate", "IT", 35000));
		employeeSet1.add(new Employee(103, "CCCC", "Manager", "Sales", 95000));
		empInAProjMap.put(p, employeeSet1);
		
		p=new Project(704,"P4");
		Set<Employee> employeeSet2=new HashSet<>();
		employeeSet2.add(new Employee(108, "HHHH", "Data Analyst", "IT", 75000));
		employeeSet2.add(new Employee(112, "LLLL", "Tech ops Engg", "IT", 55000));
		empInAProjMap.put(p, employeeSet2);
		
		p=new Project(703,"P3");
		Set<Employee> employeeSet3=new HashSet<>();
		employeeSet3.add(new Employee(104, "DDDD", "Sr. Manager", "IT", 175000));
		employeeSet3.add(new Employee(105, "EEEE", "Software Engg", "IT", 100));
		employeeSet3.add(new Employee(109, "IIII", "ML Engineer", "IT", 275000));
		employeeSet3.add(new Employee(110, "JJJJ", "Sr. Manager", "IT", 175000));
		employeeSet3.add(new Employee(111, "KKKK", "SDE Intern", "IT", 10));
		empInAProjMap.put(p, employeeSet3);
		
		p=new Project(705,"P5");
		Set<Employee> employeeSet4=new HashSet<>();
		employeeSet4.add(new Employee(106, "FFFF", "Sr. Manager", "IT", 175000));
		employeeSet4.add(new Employee(107, "GGGG", "Sr. Software Engg", "IT", 115000));
		empInAProjMap.put(p, employeeSet4);

		p=new Project(702,"P2");
		empInAProjMap.put(p, new HashSet<>());
		
	}
	public static Map<Project, Set<Employee>>  getEmpInAProjMap() {
		return empInAProjMap;
	}
	public static void setEmpInAProjMap(Map<Project, Set<Employee>>  empInAProj) {
		EmpInAProjDataSource.empInAProjMap = empInAProj;
	}
	
	
}
