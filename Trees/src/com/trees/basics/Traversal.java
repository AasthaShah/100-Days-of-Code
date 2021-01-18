package com.trees.basics;
import java.util.*;

public class Traversal {


	void levelOrderTraversal(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		System.out.println(root.data);
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			System.out.println(temp.data);
			if(temp.left != null) {
				queue.add(temp.left);
			}
			if(temp.right != null) {
				queue.add(temp.right);
			}
		}
		
	}
	
}
