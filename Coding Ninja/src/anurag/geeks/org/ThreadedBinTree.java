package anurag.geeks.org;
import java.util.LinkedList;
import java.util.Queue;

import anurag.utilities.org.NodeTree;

public class ThreadedBinTree {

	Queue <NodeTree> q = new LinkedList<NodeTree>();
	
	public void makeThreaded(NodeTree root){
		
		populateQueue(root,q);
		while(!q.isEmpty()){
			NodeTree x = q.poll();
			if(x.right == null && !q.isEmpty()){
				x.right = q.peek();
				
				x.threadFlag = true;
			}
		}
	}
	//print inorder using riht threads
	public void printInorder(NodeTree root){
		NodeTree curr = leftMost(root);
		
		while(curr!=null){
			System.out.print(curr.value+" ");
			if(curr.threadFlag){
				curr = curr.right;				
			}
			else
				curr = leftMost(curr.right);
		}
	}
	private NodeTree leftMost(NodeTree root){
		if(root ==null)
			return null;
		while(root.left!=null)
			root = root.left;
		return root;
		
	}
	
	private void populateQueue(NodeTree root, Queue<NodeTree> q){
		
		if(root == null)
			return;
		if(root.left!=null)
			populateQueue(root.left, q);
		q.add(root);
		
		if(root.right!=null)
			populateQueue(root.right, q);
			
		
	}
	
	public static void main(String[] args){
		NodeTree root = new NodeTree(6);
		root.left = new NodeTree(3);
		root.right = new NodeTree(8);
		root.left.left = new NodeTree(1);
		root.left.right = new NodeTree(5);
		root.right.left = new NodeTree(7);
		root.right.right = new NodeTree(11);
		root.right.right.left = new NodeTree(9);
		root.right.right.right = new NodeTree(13);
		
		ThreadedBinTree obj = new ThreadedBinTree();
		obj.makeThreaded(root);
		
		obj.printInorder(root);
		
		
		
		
		
	}
	
	
}
