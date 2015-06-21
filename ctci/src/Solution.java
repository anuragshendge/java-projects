import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     	Scanner scan = new Scanner(System.in);
     	String inputStr = scan.nextLine();
     	String[] inArr = inputStr.split(" ");
     	long N = Long.parseLong(inArr[0]);
     	long K = Long.parseLong(inArr[1]);
     	String boys = scan.nextLine();
     	String girls = scan.nextLine();
     	String[] bArr = boys.split(" ");
     	String[] gArr = girls.split(" ");
     	long [] b_ht = new long[(int) N];
     	long [] g_ht = new long[(int) N];
     	long count=0;
    	boolean isGirl[] = new boolean[(int) N];
     	boolean isBoy[] = new boolean[(int) N];
     	
    	for(int i=0;i<N;i++){
     	b_ht[i] = Long.parseLong(bArr[i]);
     	g_ht[i] = Long.parseLong(gArr[i]);
     
   	}//System.out.println(K);
     	
     	Arrays.sort(b_ht);
     	Arrays.sort(g_ht);
    
     		for(int i=0;i<N;i++){
           	for(int j=0;j<N;j++){
   
           	if(Math.abs((b_ht[i]-g_ht[j]))<=K  && isGirl[j]==false){
     			System.out.println("B= "+b_ht[i]+" G="+g_ht[j]+" sum="+Math.abs(b_ht[i]-g_ht[j])+" Count="+count);
     				count++;
     				isGirl[j] = true;
     			
     				//break;			
     			}
           	  	
        	
           	}
     	}
     	System.out.println(count);
    }
}