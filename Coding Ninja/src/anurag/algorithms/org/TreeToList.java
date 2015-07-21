package anurag.algorithms.org;

public class TreeToList {

	/*
	 * Join Node a and Node b
	 * a-->b  b-->a 
	 * 											
	 * */
	public static void join(Node a, Node b){
		a.right = b;
		b.left =a;
	}
	public static Node append(Node a, Node b){
		
		if(a == null)
			return b;
		if(b == null)
			return a;

		Node aLast = a.left;
		Node bLast = b.left;
		join(aLast,b);
		join(bLast,a);
		return a;	
	}
	
	public static Node treeToList(Node root){
		
		if(root == null)
			return null;
	
		Node aList = treeToList(root.left);
		Node bList = treeToList(root.right);
		
		root.left = root;
		root.right = root;
		
		aList = append(aList,root);
		aList = append(aList, bList);
		return aList;
	}
	
	
	// Tree creation. Initial root required - JAVA no reference pointer that is why!
	public static void createTree(Node root, int newValue) {
		if (root.value >= newValue) {
			if (root.left != null)
				createTree(root.left, newValue);
			else
			root.left = new Node(newValue);
		} else {
			if (root.right != null)
				createTree(root.right, newValue);
			else
			root.right = new Node(newValue);
		}
	}

	// Inorder
	public static void print(Node root) {

		if (root == null)
			return;
		System.out.print("");
		print(root.left);
		System.out.print(Integer.toString(root.value)+" ");
		print(root.right);
	//	System.out.println();
	}
//List travesal 
	public static void printDLL(Node head){
		Node current = head;
		do{
			System.out.print("["+current.value+"] ");
			current = current.right;
		}while(current!=head);
		
	}
	
	
	public static void main(String[] args) {

		Node root = new Node(4);
		createTree(root, 2);
        createTree(root, 1);
        createTree(root, 3);
        createTree(root, 5);
		System.out.println("Tree:");
        print(root);
       Node head = treeToList(root);
       System.out.println("\n List");
       printDLL(head);
	}
}
