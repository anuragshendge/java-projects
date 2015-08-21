package anurag.geeks.org;

import anurag.utilities.org.NodeTree;

public class IsFoldableTree {


	
	public boolean isFoldable(NodeTree root){
		
		if(root == null)
			return true;
	return	isSimilar(root.left,root.right);
		
	}
	
	private boolean isSimilar(NodeTree a, NodeTree b){
		
		if(a == null && b == null)
			return true;
		
		if(a== null || b == null)
			return false;
		
		return isSimilar(a.left,b.right) && isSimilar(a.right,b.left);
		
	}
	
	
	
	public static void main(String[] args){
		NodeTree root = new NodeTree(10);
		root.left = new NodeTree(1);
		root.right = new NodeTree(2);
		root.left.left = new NodeTree(3);
		root.right.right = new NodeTree(3);
		IsFoldableTree obj = new IsFoldableTree();
		if(obj.isFoldable(root))
			System.out.println("Yes, the tree is foldable");
		else
			System.out.println("No, the tree is not foldable");
		
	}
	
}

