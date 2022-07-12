package com.Chitranshu.client;

import java.util.Scanner;

import com.Chitranshu.presentationLayer.*;

public class ProjectAllocationClient {

	public static void main(String args[]) {
		
		ProjectAllocationPresentation ProjAllocPresentation=new ProjectAllocationPresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("-------Menu-------");
			ProjAllocPresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			ProjAllocPresentation.performMenu(choice);
			System.out.println();
					
		}
	}
}
