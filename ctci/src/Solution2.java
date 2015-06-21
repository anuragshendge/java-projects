import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	String temp = scan.nextLine();
    	long N = Long.parseLong(temp);
    	String S = scan.nextLine();
        S = S.trim();
        N = S.length();
        
        long count = 0;
    	long[] helper = new long[126];
    	
    	for(int i=0;i<N;i++)
    		helper[S.charAt(i)]++; 
 
    	for(int i=0;i<126;i++){
    		if(helper[i]!=0){
    			 long n =helper[i];
    			count += ((n*(n+1))/2);
    			
    		}
    	}
    	
    	System.out.println(count);
    	
    
    }
}