package anurag.StackandQueues.org;

public class Q7Driver {

	public static void main(String[] args){
		
		AnimalQueue qObj = new AnimalQueue();
		
		qObj.enqueue(new Cat("Kitty"));
		qObj.enqueue(new Cat("Betty"));
		qObj.enqueue(new Dog("Fido"));
		qObj.enqueue(new Dog("Dora"));
		qObj.enqueue(new Cat("Kari"));
		qObj.enqueue(new Dog("Dexter"));
		qObj.enqueue(new Dog("Dobo"));
		qObj.enqueue(new Cat("Copa"));
		
		System.out.println(qObj.dequeueCat().getName());
		
		
	}
	
	
	
}
