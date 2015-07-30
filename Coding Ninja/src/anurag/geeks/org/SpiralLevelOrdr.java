package anurag.geeks.org;

import java.util.Stack;

import anurag.utilities.org.NodeTree;

public class SpiralLevelOrdr {

	public static void main(String[] args) {

		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		root.left.left = new NodeTree(7);
		root.left.right = new NodeTree(6);
		root.right.left = new NodeTree(5);
		root.right.right = new NodeTree(4);

		System.out.println("Recusrive Spiral print");
		printRec(root);
		System.out.println("\nIterative Spiral print");
		printIterative(root);
	}
	
	private static void printIterative(NodeTree root){
		
		if(root == null)
			return;
		
		Stack<NodeTree> s1 = new Stack<NodeTree>();// right to left
		Stack<NodeTree> s2 = new Stack<NodeTree>(); //left to right
	
		s1.push(root);
	
		while(!s1.isEmpty() || !s2.isEmpty()){
			while(!s1.isEmpty()){
				NodeTree temp1 = s1.pop();
				System.out.print(temp1.value+" ");
				if(temp1.right != null)
					s2.push(temp1.right);
				if(temp1.left != null)
					s2.push(temp1.left);
					
			}
			
			while(!s2.isEmpty()){
				NodeTree temp2 = s2.pop();
				System.out.print(temp2.value+" ");
				if(temp2.left !=null)
					s1.push(temp2.left);
				if(temp2.right != null)
					s1.push(temp2.right);
				
			}
			
		}
		
		
	}

	private static void printRec(NodeTree root) {

		int flag = 1;
		int h = height(root);

		for (int i = 1; i <= h; i++) {
			printLevel(root, i, flag);
			flag *= -1;
		}

	}

	
	
	private static void printLevel(NodeTree root, int level, int flag) {
		if (root == null)
			return;

		if (level == 1)
			System.out.print(root.value + " ");
		else if (level > 1) {

			if (flag > 0) {
				printLevel(root.right, level - 1, flag);
				printLevel(root.left, level - 1, flag);

			} else {

				printLevel(root.left, level - 1, flag);
				printLevel(root.right, level - 1, flag);


			}

		}

	}
	
	

	private static int height(NodeTree root) {

		if (root == null)
			return 0;
		int l = height(root.left);
		int r = height(root.right);

		if (l > r)
			return l + 1;
		return r + 1;

	}

}
