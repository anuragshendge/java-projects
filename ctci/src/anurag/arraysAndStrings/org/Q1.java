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
	@SuppressWarnings("unused")
	private static boolean checkDuplicate(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (map.containsValue(str.charAt(i)))
				return false;
			else
				map.put(i, str.charAt(i));

		}

		return true;
	}

	private static boolean isUnique(String str) {

		if (str.length() > 128)
			return false;

		boolean[] trackArray = new boolean[128];

		for (int i = 0; i < str.length(); i++) {

			int val = str.charAt(i);
			if (trackArray[val])
				return false;
			trackArray[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "122321323";

		if (isUnique(str))
			System.out.println("Unique");
		else
			System.out.println("Duplicate present");

	}

}
