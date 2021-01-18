package com.trees.basics;

//Self declaring binary tree
public class BinaryTree {

	TreeNode root;
	
	//Default Constructor
	BinaryTree() {
		root = null;
	}
	
	//Paramterized constructor
	BinaryTree(int data) {
		root = new TreeNode(data);
	}
	
	
	public static void main(String[] args) {
		BinaryTree br = new BinaryTree();
		br.root = new TreeNode(4);
		br.root.left = new TreeNode(2);
		br.root.right = new TreeNode(1);
		br.root.left.left = new TreeNode(6);

	}

}
