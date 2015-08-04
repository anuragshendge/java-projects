package anurag.geeks.org;

import anurag.utilities.org.NodeTree;

public class ConvertChildSum {

	public static void main(String[] args) {
		ConvertChildSum obj = new ConvertChildSum();

		NodeTree root = new NodeTree(50);
		root.left = new NodeTree(7);
		root.right = new NodeTree(2);
		root.left.left = new NodeTree(3);
		root.left.right = new NodeTree(5);
		root.right.left = new NodeTree(1);
		root.right.right = new NodeTree(30);
		System.out.println("Tree before conversion:");
		printIno(root);
		System.out.println("\n Tree after conversion:");
		obj.childSumTree(root);
		printIno(root);
	}

	private static void printIno(NodeTree root) {

		if (root == null)
			return;
		printIno(root.left);
		System.out.print(root.value + " ");
		printIno(root.right);

	}

	void childSumTree(NodeTree root) {

		if ((root == null) || (root.left == null && root.right == null))
			return;
		int left_data = 0, right_data = 0, diff;
		childSumTree(root.left);
		childSumTree(root.right);

		if (root.left != null)
			left_data = root.left.value;
		if (root.right != null)
			right_data = root.right.value;

		diff = (left_data + right_data) - root.value;
		if (diff > 0)
			root.value += diff;
		if (diff < 0)
			increment(root, -diff);

	}

	private void increment(NodeTree root, int diff) {
		if (root.left != null) {
			root.left.value += diff;
			increment(root.left, diff);
		}

		else if (root.right != null) {
			root.right.value += diff;
			increment(root.right, diff);
		}
	}

}
