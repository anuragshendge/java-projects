package anurag.geeks.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import anurag.utilities.org.NodeTree;

/*
 * Given a number X,determine if the path has the sum = X
 * Also give the Nodes on the path. * 
 * 
 * */

public class PathSum {

	public boolean PathSum(NodeTree root, int sum, ArrayList<Integer> result) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null) {
			if (sum == root.value) {
				result.add(root.value);
				return true;
			} else {
				return false;
			}
		}

		if (PathSum(root.left, sum - root.value, result)) {
			result.add(root.value);
			return true;
		}
		if (PathSum(root.right, sum - root.value, result)) {
			result.add(root.value);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		NodeTree root = new NodeTree(10);
		root.left = new NodeTree(5);
		root.right = new NodeTree(10);
		root.left.left = new NodeTree(9);
		root.left.right = new NodeTree(8);
		root.right.left = new NodeTree(11);

		ArrayList<Integer> result = new ArrayList<Integer>();
		PathSum obj = new PathSum();
		if (obj.PathSum(root, 31, result)) {
			Collections.reverse(result);
			System.out.println(result);
		} else {
			System.out.println("No Path");
		}

	}

}
