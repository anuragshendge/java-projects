package anurag.arraysAndStrings.org;

public class Q8 {

	
	public static boolean isRotation(String s1, String s2){
		if((s1.length()!= s2.length()) || s1.length() == 0)
			return false;
	String newStr = s1.concat(s1);
	return newStr.contains(s2);	
	}
	
	public static void main(String[] args){
		String s1 = "Waterbottle";
		String s2 = "erbottleWat";
		if(isRotation(s1, s2))
			System.out.println("It is the rotation");
	}
	
}

