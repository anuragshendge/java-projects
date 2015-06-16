package anurag.arraysAndStrings.org;

public class Q3 {

	private String str1;
	private String str2;
	
	public Q3(String str1, String str2){
		this.str1 = str1;
		this.str2 = str2;		
	}
	
	private boolean isPermutation(){
	
		int[] countArray = new int[256];
		if(str1.length()!= str2.length())
			return false;
		for(int i=0; i<str1.length(); i++)
			countArray[str1.charAt(i)]++;
		
		for(int i=0;i<str2.length();i++){
			if(--countArray[str2.charAt(i)]< 0)
				return false;
		}
		
			return true;
	}
	
	
	public static void main(String[] args){
		
			Q3 q3Obj = new Q3("anurag","anurag");
			
			if(q3Obj.isPermutation())
				System.out.println("The strings are anagrams");
			else
				System.out.println("Strings are not anagrams");
		
		
	}
	
}
