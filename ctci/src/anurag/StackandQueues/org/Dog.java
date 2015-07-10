package anurag.StackandQueues.org;

public class Dog extends Animal {

	public Dog(String n) {
		super(n);
	}

	public String getName() {
		if(this != null)
		return "Dog->" + name;
		else
			return "There ani't got not Dog";
	}
}
