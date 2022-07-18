package com.chitranshu.linkedLists;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LinkedListsMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		GenericSortedSLL<Integer> sortedList=new GenericSortedSLL<Integer>();
	
		BiFunction<Integer, Integer, Integer> compareLogic=Integer::compareTo;
		
		while(true) {
			System.out.println("=======Menu for Sorted Linked List======");
			System.out.println("1. Insert element");
			System.out.println("2. Delete element");
			System.out.println("3. Display Linked list");
			System.out.println("4. Display LL in reverse order");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter element: ");
				int ins=sc.nextInt();
				sortedList.insertElement(ins, compareLogic);;
				break;
				
			case 2:
				System.out.print("Enter element: ");
				int del=sc.nextInt();
				if(sortedList.deleteElement(del)==true) {
					System.out.println("Deleted successfully!");
				}
				else {
					System.out.println("Element "+del+" not found!");
				}
				break;
			
			case 3:
				sortedList.displayLL();
				break;
			
			case 4:
				sortedList.displayReverseLL();
				break;
				
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Invalid choice");
				
			}
		}
	}
}
