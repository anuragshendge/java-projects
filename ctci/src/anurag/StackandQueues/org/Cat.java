package anurag.StackandQueues.org;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	public String getName() {
		if(this != null)
		return "Cat->" + name;
		
		return "There ani't got not Cat";
	}
}
