package anurag.geeks.org;

import anurag.utilities.org.NodeTree;

public class LeafNodeCount {

	public static void main(String[] args) {

		NodeTree root = new NodeTree(4);
		root.left = new NodeTree(2);
		root.right = new NodeTree(5);
		root.left.left = new NodeTree(1);
		root.left.right = new NodeTree(3);

		System.out.println("The count of the leaf nodes=" + leafCount(root));

	}

	private static int leafCount(NodeTree root) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		int count = leafCount(root.left) + leafCount(root.right);

		return count;
	}

}
