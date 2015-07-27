package anurag.algorithms.org;

public class Node {
		public char value;
		public Node left;
		public Node right;
		public Node(int newValue){
			this.value = (char) newValue;
			left = right = null;
		}
}
