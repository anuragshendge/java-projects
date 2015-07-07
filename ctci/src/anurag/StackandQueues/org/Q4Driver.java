package anurag.StackandQueues.org;

/*Interesting trivia about the tower of Hanoi. It can take forever if it is run for number of plates = 64.
 * 
 * as the minimum number of moves for it is 2^(number of disks)-1. 2^64-1 is a lot of it
 * and hence can take a long time.
 *  * I have tried to get the time in milliseconds for the input just for fun.
 * */


public class Q4Driver {

	public static void main(String[] args){
	
		TowerOfHanoi[] tower = new TowerOfHanoi[3];
		
		for(int i=0; i<3; i++){
			tower[i] = new TowerOfHanoi(i);
		}
		
		int numberOfDisk = 12;
		for(int i=numberOfDisk;i>0;i--)
			tower[0].addDisk(i);
				long startTime = System.currentTimeMillis();
		tower[0].moveDisk(numberOfDisk, tower[2], tower[1]);
		long endTime = System.currentTimeMillis();
		long total = endTime - startTime;
		System.out.println("Time taken in milis="+total);
		total /= 1000;
		System.out.println("Time taken in Sec="+total);
		
	}
	
}
