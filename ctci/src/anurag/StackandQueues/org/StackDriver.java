package anurag.StackandQueues.org;

public class StackDriver {

	
	public static void main(String[] args){
		
		StackImpl<Integer> stackObj = new StackImpl<>(); 
		
		stackObj.push(55);
		stackObj.push(44);
		stackObj.push(33);
		stackObj.push(22);
		
		System.out.println("Pop output is "+stackObj.pop());
		System.out.println("Peek output is "+stackObj.peek());
		
	}
	
}
