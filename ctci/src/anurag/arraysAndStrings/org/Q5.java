package anurag.arraysAndStrings.org;

public class Q5 {
/*
 * beware of checking the size of i and j pointers */
	private static String compressString(String str){
		
		int sizeComStr = sizeOfCompressedStr(str);
		int orgLen = str.length();
		if(sizeComStr>= orgLen)
			return str;
		
		StringBuffer myStr = new StringBuffer();
		int i=0,j=i+1;
		int count =1;
		
		while(i<orgLen && j<orgLen){
		
			if(str.charAt(i) == str.charAt(j)){
				count++;
				j++;							
			}
			else{
				
				myStr.append(str.charAt(i));
				myStr.append(count);
				i=j;
				count = 1;	
				j++;
				if(j>=orgLen)
					break;
				
			}
			
			
		}
		
		myStr.append(str.charAt(i));
		myStr.append(count);
		
		return myStr.toString();	
		
	}
	
	private static int sizeOfCompressedStr(String str){
		int orgLen = str.length();
		int i=0,j=i+1;
		int comSize = 0;
		while(i<orgLen && j<orgLen){
			
			if(str.charAt(i) == str.charAt(j)){
				if(j+1 < orgLen)
				j++;
				else
					break;
			
			}
			else
			{
				//System.out.println("Before = "+comSize+" i and j"+i+" "+j);
				comSize += 2;
				//System.out.println("After = "+comSize+" i and j"+i+" "+j);
				i=j;
				if(i+1<orgLen)
				j=i+1;
				else
					break;
			}
		

		}
		
		comSize+=2;
		return comSize;
	}
	
	
	public static void main(String[] args){
		
		String newStr = compressString("abcddddddd");
		System.out.println(newStr);
	}
	
}
