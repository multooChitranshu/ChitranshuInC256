package com.chitranshu.linkedLists;

import java.util.function.BiFunction;

public class GenericSortedSLL<T> extends GenericSinglyLinkedLists<T> {
	
	public void insertElement(T data, BiFunction<T, T, Integer> compareLogic) {
		
		Node newNode=new Node(data);
			
		if(head==null || compareLogic.apply(head.data, newNode.data)==1 ) {
			newNode.next=head;
			head=newNode;
		}
		else {
			Node prev=null;
			Node curr=head;
			while(curr!=null) {
				if(compareLogic.apply(curr.data, newNode.data)==1)
					break;
				prev=curr;
				curr=curr.next;
			}
			prev.next=newNode;
			newNode.next=curr;
		}
	}

}
