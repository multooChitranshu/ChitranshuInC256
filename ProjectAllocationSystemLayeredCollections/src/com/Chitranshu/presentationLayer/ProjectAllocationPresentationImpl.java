package com.Chitranshu.presentationLayer;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.Chitranshu.bean.Employee;
import com.Chitranshu.bean.Project;
import com.Chitranshu.serviceLayer.*;

public class ProjectAllocationPresentationImpl implements ProjectAllocationPresentation {

	ProjectAllocationService projAllocService=new ProjectAllocationServiceImpl();
	
	@Override
	public void showMenu() {
		
		System.out.println("1. Show the current status of allocated projects");
		System.out.println("2. Allocate a Project to an Employee");
		System.out.println("3. Deallocate an Employee from a Project");
		System.out.println("4. Shift an Employee to a different project");
		System.out.println("5. Exit");
		
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		int empID, projID;
		try {
		switch (choice) {
		case 1:
//			System.out.println(projAllocService.getEmpInAProjMap());
			Map<Project, Set<Employee>> empInAProjMap=projAllocService.getEmpInAProjMap();
			for(Project proj:empInAProjMap.keySet()) {
				System.out.println(proj+"\t"+empInAProjMap.get(proj));
			}
			break;
			
		case 2:
			System.out.print("Enter Employee ID: ");
			empID=scanner.nextInt();
			System.out.print("Enter Project ID: ");
			projID=scanner.nextInt();
			if(projAllocService.allocateProject(empID, projID))
				System.out.println("Allocation Successful!");
			else
				System.out.println("Allocation Failed!!!!!");
			break;
			
		case 3:
			System.out.print("Enter Employee ID: ");
			empID=scanner.nextInt();
			System.out.print("Enter Project ID: ");
			projID=scanner.nextInt();
			if(projAllocService.deAllocateProject(empID, projID))
				System.out.println("Deallocation Successful!");
			else
				System.out.println("Deallocation Failed!!!!!");
			break;
			
		case 4:
			System.out.print("Enter Employee ID: ");
			empID=scanner.nextInt();
			System.out.print("Enter new Project ID: ");
			projID=scanner.nextInt();
			if(projAllocService.shiftToAProject(empID, projID))
				System.out.println("Employee shifted successfully!");
			else
				System.out.println("Failed! Employee could not be shifted");
			break;
			
		case 5:
			System.out.println("Thank you for using Project Management System");
			System.exit(0);
			
		default:
			System.out.println("Invalid Coice");
			break;
			
			
		}
		}
		catch(Exception exception) {
			
		}

	}

}
