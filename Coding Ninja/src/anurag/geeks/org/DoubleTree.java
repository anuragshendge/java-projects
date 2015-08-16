package anurag.geeks.org;

import anurag.utilities.org.NodeTree;

public class DoubleTree {

	public void doubleTree(NodeTree root) {

		if (root == null)
			return;

		doubleTree(root.left);
		doubleTree(root.right);

		NodeTree temp = root.left;
		root.left = new NodeTree(root.value);

		root.left.left = temp;

	}	
	
	void printInorder(NodeTree root){
		
		if(root == null)
			return;
		printInorder(root.left);
		System.out.println(root.value+" ");
		printInorder(root.right);
	}
	
	public static void main(String[] args) {
		
		NodeTree root = new NodeTree(2);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		
		
	}
}
