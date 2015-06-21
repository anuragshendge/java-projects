import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scan = new Scanner(System.in);
    	String tempStr = scan.nextLine();
		String[] tempArray = new String[3];
		tempArray = (tempStr.split(" "));
 
    	int N = (int) Long.parseLong(tempArray[0]);
    	long P = Long.parseLong(tempArray[1]);
    	long X = Long.parseLong(tempArray[2]);
        long A[] = new long[N];
        
        String str = scan.nextLine();
        String[] tStr = new String[N];
        tStr = str.split(" ");
        
        for(int i=0;i<N;i++){
            A[i] =   Long.parseLong(tStr[i]);
         }
        
        
        
        long rating[] = new long[N];
        
        long maxRating = 0;
        long maxIndex = 0;
        
        for(int i=0;i<N;i++){
            rating[i] = A[i] * (P-(i*X));
            if(rating[i] > maxRating){
                maxRating = rating[i];
                maxIndex = i+1;
            }

        }

        System.out.println(maxIndex);
    }
    	
 
}