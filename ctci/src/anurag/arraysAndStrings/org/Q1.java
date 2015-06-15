package anurag.arraysAndStrings.org;

import java.util.HashMap;

public class Q1 {
	private static HashMap<Integer, Character> map = new HashMap<>();

	/*
	 * Method using extra data structure HashMap:
	 * 
	 * Idea is to add the data in the map while checking if the value is already
	 * present or not
	 * 
	 * @param = str
	 */
	private static boolean checkDuplicate(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (map.containsValue(str.charAt(i)))
				return false;
			else
				map.put(i, str.charAt(i));

		}

		return true;
	}

	

	public static void main(String[] args) {

		String str = "anurag";

	if (checkDuplicate(str))
			System.out.println("Unique");
		else
			System.out.println("Duplicate present");


	}

}
