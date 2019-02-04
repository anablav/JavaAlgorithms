package com.java.algos;
  
public class SinglyLinkedListImpl<T> {
  
    private Node<T> head;
      
    public void add(T element){
          
        Node<T> nd = new Node<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        Node<T> tmp = head;
        while(true){
            if(tmp == null){
                //since there is only one element, both head and 
                //tail points to the same object.
                head = nd;
                break;
            } else if(tmp.getNextRef() == null){
                tmp.setNextRef(nd);
                break;
            } else {
                tmp = tmp.getNextRef();
            }
        }
    }
      
    public void traverse(){
          
    	System.out.println("\ntraversing the linked list\n");
        Node<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue()+"\t");
            tmp = tmp.getNextRef();
        }
    }
     
    public void reverse(){
         
        System.out.println("\nreversing the linked list\n");
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while(current != null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public void sort(){
        
        System.out.println("\nsorting the linked list\n");
        Node<T> tmp = null;
        Node<T> current = head;
        Node<T> next = null;
        int counter = 0;
        boolean swap = true;
        //while (swap) {
        //	swap = false;
	        while(current != null && current.next != null){
	        	if((int)current.getValue() > (int)current.next.getValue()) {
		        	counter++;
		            next = current;
		            tmp = next.next;
		            current = current.next;
		            current.next = next;
		            next.next = tmp;
		            if (counter == 1) {
		            	head = current;
		            }
		            swap = true;
	        	}
	        	current = current.next;
	        	System.out.println("\ncurrent.value " + current.value);
	        	System.out.println("\nhead.value " + head.value);
	        	traverse();
	        }
	        //traverse();
        }
    //}
     
    public static void main(String a[]){
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
        sl.add(8);
        sl.add(7);
        sl.add(5);
        sl.add(3);
        System.out.println();
        sl.traverse();
        System.out.println();
        //sl.reverse();
        //sl.traverse();
        sl.sort();
        sl.traverse();
    }
}
  
class Node<T> implements Comparable<T> {
      
    T value;
    Node<T> next;
      
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNextRef() {
        return next;
    }
    public void setNextRef(Node<T> ref) {
        this.next = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}