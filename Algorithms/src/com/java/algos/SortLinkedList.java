package com.java.algos;

public class SortLinkedList {
	
	Node<Integer> head;
	
	public void traverse() {
		Node<Integer> tmp = head;
		while(tmp!=null) {
			System.out.print(tmp.value + ",");
			tmp = tmp.next;
		}
		System.out.println();
	}
	
	public void add(int value) {
		Node<Integer> tmp = head;
		Node<Integer> nd =  new Node<>();
		nd.value = value;
		nd.next = null;
		
		if(tmp == null) {
			head = nd;
			return;
		}
		
		while(tmp!=null) {
			if(tmp.next == null) {
				tmp.next = nd;
				break;
			}
			tmp = tmp.next;
		}
	}
	
	public void sort() {
		Node<Integer> curr = head;
		boolean swap = false;
		
		while(true) {
			swap = false;
			curr = head;
			while(curr!=null && curr.next!=null) {
				if(curr.value > curr.next.value) {
					int tempValue = curr.value;
					curr.value = curr.next.value;
					curr.next.value = tempValue;
					swap = true;
				}
				curr = curr.next;
			}
			if (!swap) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		SortLinkedList sll = new SortLinkedList();
		sll.add(10);
		sll.add(50);
		sll.add(30);
		sll.add(11);
		sll.add(22);
		sll.add(25);
		sll.add(27);
		
		System.out.println("Traversing the linked list");
		sll.traverse();
		
		System.out.println("Sorting the linked list");
		sll.sort();
		sll.traverse();
	}
}
