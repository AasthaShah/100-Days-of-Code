package com.trees.basics;

public class Insertion {

	TreeNode insertAtLeftMostEnd(TreeNode root, int data) {
		TreeNode temp = root;
		while(temp.left != null) {
			temp = temp.left;
		}
		temp.left = new TreeNode(data);
		return root;
	}
	
	TreeNode insertAtRightMostEnd(TreeNode root, int data) {
		TreeNode temp = root;
		while(temp.right != null) {
			temp = temp.right;
		}
		temp.right = new TreeNode(data);
		return root;
	}
}
