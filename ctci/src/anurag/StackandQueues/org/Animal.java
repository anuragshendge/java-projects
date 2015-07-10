package anurag.StackandQueues.org;

public abstract class  Animal {

	private int order;
	protected String name;
	
	public Animal(String n){
		name = n;
	}
	
	public void setOrder(int ord){
		order = ord;
	}	
		
	public int getOrder(){
		return order;
	}
	
	public abstract String getName();
	
	public boolean isOlder(Animal a){
		if(this.order < a.order)
			return true;
		return false;
	}
}
