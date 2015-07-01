package anurag.StackandQueues.org;

import java.util.*;

public class StackSet {

	ArrayList<Stack> stackArray = new ArrayList<>();
	int threshHold;

	StackSet(int threshHold) {
		this.threshHold = threshHold;
	}

	
	public boolean isFull(){
		
		Stack last = stackArray.get(stackArray.size()-1);
		if(last.size() == threshHold-1)
			return true;
		return false;
	}

	void push(int value) {
		
		if(stackArray.size() == 0 || isFull()){
			
			Stack st = new Stack();
			
			st.push(value);
		//	System.out.println(st.peek());
			stackArray.add(st);	
			
		}
		else{
			Stack last = stackArray.get(stackArray.size()-1);
			last.push(value);
			stackArray.add(last);
			
		}
	}

	public int pop(){
		
		if(stackArray.size()>0){
			Stack last = stackArray.get(stackArray.size()-1);
			int x =0;
			if(!last.empty())
			x = (int)last.pop();
			
			if(last.size() == 0){
				stackArray.remove(stackArray.size()-1);
			}
			return x;
		}
		else{
			System.out.println("Notrhing to pop");
			return -11111;
		}
	}
	
	
	
}
