package com.java.algos;

public class SwapNodesLinkedList {
	
	Node<Integer> head;
	
	public void swapNodes(int x, int y) {
		Node<Integer> currX = head, prevX = null;
		Node<Integer> currY = null, prevY = null;
		
		Node<Integer> tmp = head;
		while(tmp != null) {
			if(tmp.value != x) {
			   prevX = tmp;
			   currX = prevX.next;
			   tmp = tmp.next;
			} else {
				break;
			}			
		}	
		
	    tmp = head;
	    while(tmp != null) {
			if(tmp.value != y) {
			   prevY = tmp;
			   currY = prevY.next;
			   tmp = tmp.next;
			} else {
				break;
			}			
		}	
	    
	    if (prevX != null) {
	    	prevX.next = currY;
	    } else {
	    	head = currY;
	    }
	    
	    if (prevY != null) {
	    	prevY.next = currX;
	    } else {
	    	head = currX;
	    }
	    
	    if(currX != null) {
	    	tmp = currX.next;
	    	currX.next = currY.next;
	    	currY.next = tmp;   
	    }
	}
	
	public void add(int val) {
		Node<Integer> nd = new Node<>();
		nd.value = val;
		nd.next = null;
		
		Node<Integer> tmp = head;
		
		if ( head == null ) {
			head = nd;
		} else {
			while (tmp != null) {
				if(tmp.next == null) {
					tmp.next = nd;
					break;
				}
				tmp = tmp.next;
			}
		}
	}
	
	public void traverse() {
		Node<Integer> tmp = head;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
	
	public static void main(String[] args) {
		SwapNodesLinkedList ll = new SwapNodesLinkedList();
		ll.add(10);
		ll.add(50);
		ll.add(30);
		ll.add(11);
		ll.add(22);
		ll.add(25);
		ll.add(27);
		System.out.println("Before Swapping");
		ll.traverse();
		
		ll.swapNodes(10,27);
		System.out.println("After Swapping");
		ll.traverse();
	}
}
