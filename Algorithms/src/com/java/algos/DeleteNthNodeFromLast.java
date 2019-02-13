package com.java.algos;

public class DeleteNthNodeFromLast {
	
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
	
	public Node<Integer> findNthNode(int n) {
		Node<Integer> curr = head;
		Node<Integer> nthNode = head;
		int i=1;
		while ( i<= n) {
			curr = curr.next;
			i++;
		}
		
		while(curr != null) {
			nthNode = nthNode.next;
			curr = curr.next;
		}
		return nthNode;
	}
	
	public void deleteNthNode(int n) {
		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> next = curr.next;
		Node<Integer> nthNode = head;
		int i=1;
		while ( i<= n) {
			curr = curr.next;
			i++;
		}
		
		while(curr != null) {
			prev = nthNode;
			nthNode = nthNode.next;
			next = nthNode.next;
			curr = curr.next;
		}
		
		prev.next = next;
	}
	
	public static void main(String[] args) {
		DeleteNthNodeFromLast dn = new DeleteNthNodeFromLast();
		dn.add(10);
		dn.add(50);
		dn.add(30);
		dn.add(11);
		dn.add(22);
		dn.add(25);
		dn.add(27);
		
		System.out.println("Before deleting nth node from last");
		dn.traverse();
		
		System.out.println("Finding nth node from last");
		Node<Integer> nd = dn.findNthNode(5);
		System.out.println("nth node from last is " + nd.value);
		
		System.out.println("Deleting nth node from last");
		dn.deleteNthNode(5);
		dn.traverse();
	}
}
