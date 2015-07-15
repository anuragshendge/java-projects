package anurag.algorithms.org;

public class CircularTour {

		
	public static int printTour(int[] petrol, int[] distance){
		
		int start =0;
		int end = 1;
		int currentPetrol = distance[start] - distance[start];
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
		
		int[] petrol = {6,3,7};
		int[] distance = {4,6,3};
		
		System.out.println("Start the tour from index: "+printTour(petrol, distance));
	
	}
	
}
