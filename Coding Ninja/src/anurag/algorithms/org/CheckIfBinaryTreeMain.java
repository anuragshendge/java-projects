package anurag.algorithms.org;

import anurag.utilities.org.NodeTree;


/*
 * Given a root of a tree as an input
 * check if it is a binary tree or not.
 * This is a queue application. Please make use 
 * of custom queue and not the readymade queue.
 * Create a custom queue class of type (Node).
 * Node will be for the tree as you would have guessed. 
 * 	
 * 
 * Files included:
 * -this.java
 * Node.java
 * 
 * 
 * */
public class CheckIfBinaryTreeMain {

	public static void main(String[] args){
		IsCompleteBinaryTree obj = new IsCompleteBinaryTree();
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		root.right.left = new NodeTree(6);
		if(obj.isComplete(root))
			System.out.println("The tree is a complete binary tree");
		else
			System.out.println("The tree is NOT a complete binary tree");
	}
}
