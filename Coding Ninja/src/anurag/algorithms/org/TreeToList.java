package anurag.algorithms.org;

public class TreeToList {

	/*
	 * Join Node a and Node b
	 * a-->b  b-->a 
	 * 											
	 * */
	public static void join(Node a, Node b){
		a.large = b;
		b.small =a;
	}
	public static Node append(Node a, Node b){
		
		if(a == null)
			return b;
		if(b == null)
			return a;

		Node aLast = a.small;
		Node bLast = b.small;
		join(aLast,b);
		join(bLast,a);
		return a;	
	}
	
	public static Node treeToList(Node root){
		
		if(root == null)
			return null;
	
		Node aList = treeToList(root.small);
		Node bList = treeToList(root.large);
		
		root.small = root;
		root.large = root;
		
		aList = append(aList,root);
		aList = append(aList, bList);
		return aList;
	}
	
	
	// Tree creation. Initial root required - JAVA no reference pointer that is why!
	public static void createTree(Node root, int newValue) {
		if (root.value >= newValue) {
			if (root.small != null)
				createTree(root.small, newValue);
			else
			root.small = new Node(newValue);
		} else {
			if (root.large != null)
				createTree(root.large, newValue);
			else
			root.large = new Node(newValue);
		}
	}

	// Inorder
	public static void print(Node root) {

		if (root == null)
			return;
		System.out.print("");
		print(root.small);
		System.out.print(Integer.toString(root.value)+" ");
		print(root.large);
	//	System.out.println();
	}
//List travesal 
	public static void printDLL(Node head){
		Node current = head;
		do{
			System.out.print("["+current.value+"] ");
			current = current.large;
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
