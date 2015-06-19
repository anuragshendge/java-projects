package anurag.StackandQueues.org;

public class StackDriver {

	
	public static void main(String[] args){
		
		StackDriver obj = new StackDriver();
		StackImpl<StackDriver> stackObj = new StackImpl<>(); 
		
		stackObj.push(obj);
		
		System.out.println("Peek output is "+stackObj.peek());	
		System.out.println("Pop output is "+stackObj.pop());
		//stackObj.push("is");
		//stackObj.push("in the US");
		System.out.println("Peek output is "+stackObj.peek());
	}
	
}
