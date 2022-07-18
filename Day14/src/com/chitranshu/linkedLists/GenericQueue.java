package com.chitranshu.linkedLists;

import com.chitranshu.linkedLists.GenericSinglyLinkedLists.Node;

public class GenericQueue<T>{
	public class Node{
		T data;
		Node next;
		public Node(T data) {
//			super();
			this.data = data;
		}
		
	}
	Node head;
	Node tail;
	
	public void push(T data) {
		Node newNode=new Node(data);
		if(head==null) {       //empty queue
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public T pop() {
		if(head!=null) {
			T popped=head.data;
			head=head.next;
			return popped;
		}
		return null;
	}
	
	public void displayQueue() {
		if(head==null) {
			System.out.println("Queue Empty");
		}
		else {
			System.out.print("(head)");
			Node curr=head;
			while(curr.next!=null) {
				System.out.print(curr.data+" --> ");
				curr=curr.next;
			}
			System.out.println(curr.data+"(tail)");
		}
	}
}
