package anurag.utilities.org;

/*
 * A general utility node for trees
 * 
 * 
 * */

public class NodeTree {

	public int value;
	public NodeTree left;
	public NodeTree right;
	public boolean threadFlag;

	public NodeTree(int value) {
		this.value = value;
		left = null;
		right = null;
		threadFlag = false;
	}
}
