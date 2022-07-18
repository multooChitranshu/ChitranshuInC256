package com.chitranshu.linkedLists;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		
		GenericQueue<Integer> queue=new GenericQueue<>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("=======Menu for Queue======");
			System.out.println("1. Push element");
			System.out.println("2. Pop element");
			System.out.println("3. Display Queue");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter element: ");
				int ins=sc.nextInt();
				queue.push(ins);
				break;
				
			case 2:
				int popped;
				try {
					popped=(Integer)queue.pop();
					System.out.println("Popped element: "+popped);
				}
				catch(NullPointerException e) {
					System.out.println("Couldn't pop! Queue is empty.");
				}
				break;
			
			case 3:
				queue.displayQueue();
				break;
				
			case 4:
				System.exit(0);
				
			default:
				System.out.println("Invalid choice");
				
			}
		}

	}

}
