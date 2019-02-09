package com.java.algos;

public class BinaryTree {
	
	BstNode root;
	
	public BstNode insert(BstNode tmpNode, BstNode node) {
		System.out.print(" ->"+tmpNode.value);
		if(tmpNode != null) {
			if(tmpNode.value >= node.value) {
				System.out.print(" [L]");
				if(tmpNode.left == null) {
					tmpNode.left = node;
					return tmpNode;
				} else {
					tmpNode = tmpNode.left;
				}
			} else {
				System.out.print(" [R]");
				if(tmpNode.right == null) {
					tmpNode.right = node;
					return tmpNode;
				} else {
					tmpNode = tmpNode.right;
				}
			}
		}
		return insert(tmpNode, node);
	}
	
	public void insertNode(int value) {
		BstNode node = new BstNode(value);
		System.out.print("[input: "+value+"]");
		
		if(root == null) {
			root = node;
			System.out.println(" -> inserted: "+value);
			return;
		}
		
		insert(root, node);
		System.out.print(" -> inserted: "+value);
        System.out.println();
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.insertNode(10);
		bt.insertNode(14);
		bt.insertNode(8);
		bt.insertNode(7);
		bt.insertNode(13);
		bt.insertNode(5);
		bt.insertNode(1);
		bt.insertNode(2);
		bt.insertNode(9);
	}
}

class BstNode{
	public int value;
	public BstNode left;
	public BstNode right;
	
	BstNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}