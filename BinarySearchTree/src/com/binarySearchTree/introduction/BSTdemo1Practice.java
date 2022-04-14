package com.binarySearchTree.introduction;

public class BSTdemo1Practice {

	
	/*
	 * Class containing left and right child
	 * of a current node and key value
	 */
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int value)
		{
			this.key=value;
		}
	}
	
	//Root of the Binary Search Tree
	Node root;
	
	//Constructor
	BSTdemo1Practice(){
		root = null;
	}
	
	BSTdemo1Practice(int value){
		root = new Node(value);
	}
	
	//This method call insertRecord method
	void insert(int key) {
		root= insertRecord(root, key);
	}
	
	/* A recursive method to insert new key in BST */
	public Node insertRecord(Node root, int key) {
		/* If the tree is empty, return a new node */
		if(root == null) {
			root = new Node(key);
			return root;
		}
		/* Otherwise, recur down the tree */
		if(key > root.key)
			root.left = insertRecord(root.left, key);
		else if (key > root.key)
			root.right = insertRecord(root.right, key);
		/* return the (unchanged) node pointer */
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
