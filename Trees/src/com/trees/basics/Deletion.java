package com.trees.basics;

public class Deletion {

	TreeNode deleteLastLeftElement(TreeNode root) {
		TreeNode currentNode = root;
		TreeNode nextNode = root;
		while(nextNode.left != null) {
			currentNode = nextNode;
			nextNode = nextNode.left;
		}
		currentNode.left = null;
		return root;
	}
	
	TreeNode deleteLastRightElement(TreeNode root) {
		TreeNode currentNode = root;
		TreeNode nextNode = root;
		while(nextNode.right != null) {
			currentNode = nextNode;
			nextNode = nextNode.right;
		}
		currentNode.right = null;
		return root;
	}
	
	TreeNode deleteByData(TreeNode root, int data) {
		//By default replace left child with parent else the child that is available
		TreeNode tempLeft = root;
		TreeNode tempRight = root;
		while(tempLeft.data != data && tempRight.data != data) {
			tempLeft = tempLeft.left;
			tempRight = tempRight.right;
		}
		if(tempLeft.data == data) {
			if(tempLeft.left != null) {
				tempLeft = tempLeft.left;
			}
			else {
				tempLeft = tempLeft.right;
			}
		}
		if(tempRight.data == data) {
			if(tempRight.left != null) {
				tempRight = tempRight.left;
			}
			else {
				tempRight = tempRight.right;
			}
		}
		
		return root;
	}
	
	
	
}
