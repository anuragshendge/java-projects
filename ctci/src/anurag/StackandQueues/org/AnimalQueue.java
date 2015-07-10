package anurag.StackandQueues.org;

import java.util.LinkedList;

public class AnimalQueue {

	private int order = 0;
	private LinkedList<Dog> dogs = new LinkedList<>();
	private LinkedList<Cat> cats = new LinkedList<>();

	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;

		if (a instanceof Dog) {
			
			dogs.addLast((Dog) a);
			System.out.println("Doggg-"+a.name);
		} else {
			cats.addLast((Cat) a);
			System.out.println("Cattt-"+a.name);
		}
	}

	public Animal dequeueAny() {

		if(dogs.size() == 0 && cats.size() == 0)
			return null;
	
		if (dogs.size() == 0)
			return dequeueCat();
		else if (cats.size() == 0)
			return dequeueDog();
			
		Dog d = dogs.peek();
		Cat c = cats.peek();
		
		if(d.isOlder(c)){
			return dogs.poll();
		}
		else
			return cats.poll();
		
	}

	public Cat dequeueCat() {
		if(cats.size()!= 0)
		return cats.poll();
		
		return null;

	}
	public Dog dequeueDog() {
		if(dogs.size() != 0)
		return dogs.poll();
		return null;
	}
}