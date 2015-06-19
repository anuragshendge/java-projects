package anurag.StackandQueues.org;

public class StackImpl<T> implements StackImplInterface<T>{
	
	static int MAX_CAPACITY = 1000;
	int top = -1,capacity;
	T arr[];
	public StackImpl(){
		this(MAX_CAPACITY);
	}
	public StackImpl(int cap){
		capacity = cap;
		 arr = (T[]) new Object[capacity];			
	}
	
	@Override
	public void push(T t) throws ArrayIndexOutOfBoundsException{
		
		if(arr.length > capacity){
			Exception e = new ArrayIndexOutOfBoundsException();
			e.getMessage();
		}
		arr[++top] = t;
	}

	@Override
	public T pop() {
		if(top == -1){
			System.out.println("Empty stack");
			return null;
		}
		else
		{
			T elem = arr[top];
			arr[top] = null;
			top--;
			return elem;
		}
		
	}
	
	@Override
	public boolean isEmpty() {
	
		if(top<0)
			return true;
		return false;
	}
	@Override
	public T peek() {
	
		if(isEmpty()){
			System.out.println("Empty Stack");
			return null;
		}
		return arr[top];
		
	}
}
