package com.java.algos;

public class SwapPairLinkedList {
	Node<Integer> head;
	
	public void add(int value) {
		Node<Integer> nd = new Node<>();
		nd.value = value;
		nd.next = null;
		
		Node<Integer> tmp = head;
		
		if ( head == null ) {
			head = nd;
		} else {
			while (tmp !=null) {
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
		while(tmp!=null) {
			System.out.print(tmp.value + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}
	
	public void swapNodePair() {
		Node<Integer> tmp = head;
		while(tmp != null && tmp.next != null) {
			int tempValue = tmp.value;
			tmp.value = tmp.next.value;
			tmp.next.value = tempValue;
			tmp = tmp.next.next;
		}
	}
	
	public static void main(String[] args) {
		SwapPairLinkedList ll = new SwapPairLinkedList();
		ll.add(10);
		ll.add(50);
		ll.add(30);
		ll.add(11);
		ll.add(22);
		ll.add(25);
		ll.add(27);
		
		System.out.println("Before Swapping");
		ll.traverse();
		
		ll.swapNodePair();
		
		System.out.println("After Swapping");
		ll.traverse();		
	}
}
