package anurag.algorithms.org;

import anurag.utilities.org.NodeTree;
import anurag.utilities.org.QueueCheckBinary;

public class IsCompleteBinaryTree {

	boolean flag = false; // flag to check if the Node with partial children has been encountered
	// false = partial node not found; true: found
	
	
public boolean isComplete(NodeTree root){
	
		if(root == null)
			return true;
		
		QueueCheckBinary q = new QueueCheckBinary();
		q.enqueue(root);	
		
		while(!q.isQEmpty()){
			
		NodeTree temp = q.dequeue();	
			
			if(temp.left != null){
								
				if(flag == true)
					return false;
				
				q.enqueue(temp.left);
			}
			else
				flag = true;
			if(temp.right != null){
				if(flag == true)
					return false;
				q.enqueue(temp.right);
			}
			else
				flag = true;
			
		}
	
		return true;

	}
		
}
