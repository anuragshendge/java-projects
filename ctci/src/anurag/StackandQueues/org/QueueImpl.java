package anurag.StackandQueues.org;

public class QueueImpl<T>{
	
	private int front = -1;
	private int back = -1;
	private int capacity;
	private static int MAX_CAPACITY = 10;
	private T queue[];
	
	public QueueImpl(){
		this(MAX_CAPACITY);
	}

	public QueueImpl(int cp) {
			capacity = cp;
			queue = (T[]) new Object[capacity];
	}
	
	public boolean isEmpty(){
		if(front ==-1 && back == -1)
			return true;
		return false;
	}
	public void enqueue(T t){
		if(back+1 == capacity){
			throw new IllegalStateException("Queue is full");
		}
					
		if(isEmpty()){
			front++;
			back++;
			queue[back] = t;
		}
		else{
			queue[++back] = t;
		}
			
	}
	public T dequeue(){
		if(isEmpty()){
			System.out.println("Queue empty, nothing to remove");
			return null;
		}
		else if(front == back){
			
			T elem = null;
			elem = queue[front];
			System.out.println("Last one"+elem);
			queue[front] = null;
			front = -1;
			back =-1;
			return elem;
		}
		else{
			T elem = null;
			elem = queue[front];
			queue[front] = null;
			front++;
			return elem;
		}
	}
	
	public T peek(){
		if(isEmpty()){
			System.out.println("Empty");
		return null;
		}
		return queue[front];
	}
}
