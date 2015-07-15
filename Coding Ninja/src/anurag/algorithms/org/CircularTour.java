package anurag.algorithms.org;

public class CircularTour {
/*NOt really sure if I agree with the solution
 * 
 * 
 * */
		
	public static int printTour(int[] petrol, int[] distance){
		
		int start =0;
		int end = 1;
		int currentPetrol = petrol[start] - distance[start];
		int len = petrol.length;
		while(currentPetrol < 0 || start != end){
			
			while(currentPetrol < 0 && end != start){
				
				currentPetrol -= petrol[start]-distance[start];
				start = (start+1)%len;
				
				if(start == 0)
					return -1;
			}
			currentPetrol += petrol[end] - distance[end];
			end = (end + 1)%len;
			
		}
		
		return start;
	}
	
	public static void main(String[] args){
		
		int[] petrol = {4,6,7,4};
		int[] distance = {6,5,3,5};
		System.out.println("Start the tour from index: "+printTour(petrol, distance));
	
	}
	
}
