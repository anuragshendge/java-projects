package anurag.geeks.org;

public class DiameterTree {

	public int[] diameter(Node root) {
		int ht_dim[] = { 0, 0 };

		if (root != null) {

			int[] leftResult = diameter(root.left);
			int[] rightResult = diameter(root.right);

			int height = Math.max(leftResult[0], rightResult[0])+1;
			int leftDim = leftResult[1];
			int rightDim = rightResult[1];
			int rootDim = leftResult[0] + rightResult[0] + 1;

			int finalDiamter = getMax(leftDim, rightDim, rootDim);

			ht_dim[0] = height;
			ht_dim[1] = finalDiamter;

			return ht_dim;
		}

		return ht_dim;
	}

	private int getMax(int leftDim, int rightDim, int rootDim) {

		return Math.max(rootDim, Math.max(leftDim, rightDim));

	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.left.right = new Node(7);
		root.left.left.left = new Node(8);

		DiameterTree obj = new DiameterTree();
		System.out.println("The diameter of the given tree ="
				+ obj.diameter(root)[1]);

	}

}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

}