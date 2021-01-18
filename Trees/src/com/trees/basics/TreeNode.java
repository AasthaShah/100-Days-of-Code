package com.trees.basics;

public class TreeNode {


	int data;
	TreeNode left;
	TreeNode right;
	
	//default constuctor with no data
	public TreeNode() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	
	
	//Parameterized constuctor will only data
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	//Parameterized constructor with all the data
	public TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
