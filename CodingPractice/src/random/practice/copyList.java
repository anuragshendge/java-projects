package random.practice;

import java.util.HashMap;

// http://www.careercup.com/question?id=15294742
/*
 * The question asks :
 * 
 * You have a link list with the following structure: 
 struct Node{ Node*next; Node*other; } 

 next pointer points to next node, but "other" pointer points to any node in the list, it can be itself or null. 

 you receive the header of a list with this structure. 

 you have to copy it(allocate new memory) , you cannot modify the structure, you can not modify the list you are given.


 * 
 * 
 * */
class Node {
	int data;
	Node next;
	Node other;

}

public class copyList {

	public static Node copyLists(Node header) {
		Node temp = header;
		Node prev = null;
		Node new_header = null;

		if (header == null)
			return null;
		HashMap<Node, Node> map = new HashMap<Node, Node>();
		while (temp != null) {
			Node newNode = null;
			Node otherNode = null;

			if (!map.containsKey(temp)) {

				newNode = new Node();
				newNode.data = temp.data;
				map.put(temp, newNode);

			}
			if (temp.other != null && !map.containsKey(temp.other)) {
				otherNode = new Node();
				otherNode.data = temp.other.data;
				map.put(temp.other, otherNode);
			}

			newNode = map.get(temp);
			otherNode = map.get(temp.other);
			newNode.other = otherNode;

			if (prev == null)
				new_header = newNode;
			else
				prev.next = newNode;
			prev = newNode;
			temp = temp.next;

		}
		if (temp == null)
			prev.next = null;
		return new_header;
	}

	private static void print(Node head) {

		while (head != null) {
			System.out.print(" " + head.data);
			head = head.next;
		}

	}

	public static void main(String[] args) {

		Node org = new Node();
		org.data = 1;

		org.next = new Node();
		org.next.data = 2;

		org.next.next = new Node();
		org.next.next.data = 3;

		org.other = org.next.next;
		org.next.other = null;
		org.next.next.other = org.next;

		print(org);

		Node dup = copyLists(org);
		print(dup);

	}

}
