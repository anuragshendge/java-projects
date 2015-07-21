package anurag.geeks.org;

import anurag.algorithms.org.Node;
import anurag.utilities.org.NodeTree;

public class buildTreeInOrderPreOrder {

	public int preIndex;

	public buildTreeInOrderPreOrder() {
		preIndex = 0;
	}

	public Node buildTree(char in[], char pre[], int start, int end) {

		

		if (start > end)
			return null;
		Node tnode = new Node(pre[preIndex]);
		preIndex++;

		if (start == end)
			return tnode;

		int inIndex = search(in, pre, tnode.value, start, end);
		
		tnode.left = buildTree(in, pre,start,inIndex-1);
		tnode.right = buildTree(in, pre,inIndex+1,end);

		return tnode;

	}

	/*
	 * public void test(){
	 * 
	 * if(preIndex >5) return; System.out.println("Level="+preIndex);
	 * preIndex++; test();
	 * 
	 * }
	 */

	private int search(char[] in, char[] pre, int value, int start, int end) {

		for (int i = start; i <= end; i++) {
			if (in[i] == value)
				return i;

		}
		return -1;

	}

	public static void main(String[] args) {

		buildTreeInOrderPreOrder obj = new buildTreeInOrderPreOrder();
		
		 char in[] = {'B','A','C'};
		 char pre[] = {'A','B','C'};
		int start = 0;
		int end = in.length-1;
		
		Node root = obj.buildTree(in,pre,start,end);
		
		obj.printInorder(root);
		
	}

	private void printInorder(Node root) {
		if(root==null)
			return;
		printInorder(root.left);
		System.out.print(root.value+"> ");
		printInorder(root.right);
		
	}

}
