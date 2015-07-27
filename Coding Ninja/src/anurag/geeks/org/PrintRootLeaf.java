package anurag.geeks.org;

import anurag.utilities.org.NodeTree;

public class PrintRootLeaf {

	public void printPAth(NodeTree root) {
		int[] path = new int[1000];
		pathTrace(root, path, 0);

	}

	private void pathTrace(NodeTree root, int[] path, int pathLen) {
		
		if(root == null)
			return;
	
		path[pathLen] = root.value;
		pathLen++;
		
		if(root.left == null && root.right == null){
			printArray(path,pathLen);
		}
		else{
			pathTrace(root.left,path,pathLen);
			pathTrace(root.right,path,pathLen);
		}
	}

	private void printArray(int[] path, int pathLen){
		
		for(int i=0;i<pathLen;i++)
			System.out.print(path[i]+" ");
		
		System.out.println();
	}	
	public static void main(String[] args) {
		
		PrintRootLeaf obj = new PrintRootLeaf();
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		
		obj.printPAth(root);
		

	}
}
