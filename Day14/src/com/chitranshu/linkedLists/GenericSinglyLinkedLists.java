package com.chitranshu.linkedLists;

public class GenericSinglyLinkedLists<T> {
	
	public class Node{
		T data;
		Node next;
		public Node(T data) {
//			super();
			this.data = data;
		}
		
	}
	Node head;
	
	public void insertElement(T data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
	
	
	public boolean deleteElement(T data) {
		if(head.data==data) {
			head=head.next;
			return true;
		}
		else {
			Node prevNode=null;
			Node currNode=head;
			while(currNode!=null) {
				if(currNode.data==data) {
					prevNode.next=currNode.next;
					return true;
				}
				prevNode=currNode;
				currNode=currNode.next;
			}
			
		}
		return false;
		
	}
	
	public void displayLL() {
		Node curr=head;
		while(curr.next!=null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
	public void displayReverseLL() {
		helper(head);
		System.out.println(" ");
	}
	private void helper(Node curr) {
		if(curr.next==null) {
			System.out.print(curr.data);
			return;
		}
		else {
			helper(curr.next);
			System.out.print(" <-- "+curr.data);
		}
	}

}
