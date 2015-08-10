package anurag.geeks.org;

import java.util.Stack;

import anurag.utilities.org.NodeTree;

public class InorderSansRecursion {

	public static void inorder(NodeTree root) {

		Stack<NodeTree> s = new Stack<>();
		NodeTree current = root;
		int doneFlag = 0;

		while (doneFlag != 1) {

			if (current != null) {
				s.push(current);
				current = current.left;
			} else {

				if (!s.isEmpty()) {

					current = s.pop();
					System.out.print(current.value + " ");
					current = current.right;
				} else {

					doneFlag = 1;
				}
			}

		}

	}

	public static void main(String[] args) {

		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		System.out.println("Inroder traversla without Recusrsion");
		inorder(root);
		
	}
}
