package anurag.geeks.org;

import anurag.utilities.org.NodeTree;

public class MaxWidth {

	public int getMaxWidth(NodeTree root) {

		int h = height(root);	
		int count[] = new int[h];
		int level=0;
		getWidthRecurr(root,count,level);
		
		return getMax(count,h);
		
	}

	private int getMax(int[] count, int h) {
		
		int max = count[0];
		for(int i=0;i<h;i++)
		{
			if(count[i] >max)
				max = count[i];
		}
		return max;
	}

	private void getWidthRecurr(NodeTree root, int[] count, int level) {
		if(root == null)
			return;
		
		count[level]++;
		getWidthRecurr(root.left, count, level+1);
		getWidthRecurr(root.right, count, level+1);
	}

	private int height(NodeTree root) {
	
		if(root == null)
			return 0;
		
		int l = height(root.left);
		int r = height(root.right);
		
		if(l>r)
			return l+1;
		else
			return r+1;
		
	}

	public static void main(String[] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);		
		MaxWidth obj = new MaxWidth();
		System.out.println(obj.getMaxWidth(root));
		
	}

}
