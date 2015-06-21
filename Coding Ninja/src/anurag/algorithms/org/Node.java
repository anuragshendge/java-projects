package anurag.algorithms.org;

public class Node {
		int value;
		Node small;
		Node large;
		public Node(int value){
			this.value = value;
			small = large = null;
		}
}
