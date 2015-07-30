package anurag.geeks.org;

import java.util.LinkedList;
import java.util.Queue;

import anurag.utilities.org.NodeTree;

public class LevelOrder {

	public static void main(String[] args) {

		NodeTree root = new NodeTree(4);
		root.left = new NodeTree(2);
		root.right = new NodeTree(5);
		root.left.left = new NodeTree(1);
		root.left.right = new NodeTree(3);

		System.out.println("Using Queue");
		levelOrderQue(root);
		System.out.println("\nUsing Recurance");
				levelOrderRec(root);

	}

	private static void levelOrderQue(NodeTree root) {
		Queue<NodeTree> q = new LinkedList<NodeTree>();
		NodeTree temp = root;

		while (temp != null) {

			System.out.print(temp.value + " ");

			if (temp.left != null)
				q.offer(temp.left);
			if (temp.right != null)
				q.offer(temp.right);

			temp = q.poll();

		}

	}

	private static void levelOrderRec(NodeTree root) {
		
		int h = height(root);
		
		for(int i=1;i<=h;i++)
			printLevel(root,i);
	}
	private static void printLevel(NodeTree root, int level){
		
			if(root == null)
				return;
			if(level == 1)
				System.out.print(root.value+" ");
			else if(level>1){
				printLevel(root.left,level-1);
				printLevel(root.right,level-1);
			}
		
	}

	private static int height(NodeTree root) {

		if(root == null)
			return 0;
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		if(lheight > rheight)
			return lheight+1;
		else
			return rheight+1;
		
	}
}
