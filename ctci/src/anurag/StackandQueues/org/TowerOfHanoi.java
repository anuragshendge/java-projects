package anurag.StackandQueues.org;

import java.util.Stack;

public class TowerOfHanoi {

	private Stack<Integer> disk;
	private int index;

	public TowerOfHanoi(int index) {
		this.index = index;
		disk = new Stack<>();
	}

	public int getIndex() {
		return index;
	}

	public void addDisk(int d) {

		if (!disk.isEmpty() && d >= disk.peek())
			System.out.println("System Error, in appropritate disks");
		else
			disk.push(d);
	}

	public void moveToTop(TowerOfHanoi des){
		int top = disk.pop();
		des.addDisk(top);
		//System.out.println("Moving disk "+ top + " from tower "+ (getIndex()+1) +" to "+ (des.getIndex()+1));
	}
	
	public void moveDisk(int n,TowerOfHanoi destination, TowerOfHanoi buffer ){
		
		if(n>0){
		moveDisk(n-1, buffer,destination);
		moveToTop(destination);
		buffer.moveDisk(n-1,destination,this);
		}
	}
	
	


}
