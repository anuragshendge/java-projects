package anurag.utilities.org;

import java.util.ArrayList;
import anurag.algorithms.org.Node;

public class QueueCheckBinary {
	
	public ArrayList<NodeTree> queue;
	private int front;
	private int rear;
	
	public QueueCheckBinary(){
		queue = new ArrayList<>();
		front = -1;
		rear = -1;
	}
	
	public boolean isQEmpty(){
		if(front == -1 && rear == -1)
			return true;
		return false;		
	}
	
	public void enqueue(NodeTree t){
		
		if(isQEmpty()){
			queue.add(++rear, t);
			front++;
		}
		else{
			queue.add(++rear,t);
		}
	}
	
	public NodeTree dequeue(){
		
		if(isQEmpty()){
			return null;
		}
		if(front==rear){
			
			NodeTree delValue = queue.get(front);
			front=rear = -1;
			return delValue;
		}
		else{
			NodeTree delValue = queue.get(front++);
			return delValue;
				
		}
	}

	
}