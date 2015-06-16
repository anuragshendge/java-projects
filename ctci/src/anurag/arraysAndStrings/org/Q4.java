package anurag.arraysAndStrings.org;

public class Q4 {

	private static void replaceSpace(char[] strArray, int length) {

		/*
		 * A big assumption is that the charater array which is being passed 
		 * has to have enough space after the end to accomodate the new '%20'
		 * characters
		 * */
		int extraSpace = 0;
		int newLength = 0;

		for (int i = 0; i < length; i++) {
			if (strArray[i] == ' ')
				extraSpace++;
		}
		newLength = 2 * extraSpace + length;
		//strArray[newLength-1] = ' ';
		int j = newLength - 1;
		for (int i = length - 1; i >= 0; i--) {
			if (strArray[i] == ' ') {
				strArray[j--] = '0';
				strArray[j--] = '2';
				strArray[j--] = '%';
			}

			else {

				strArray[j] = strArray[i];
				j--;
			}

		}
		System.out.println(strArray.length);
		for(int i=0;i<newLength;i++)
			System.out.print(strArray[i]);
	}

	public static void main(String[] args) {

		String str = "Mr John Smith    ";

		char[] strArray = str.toCharArray();
		replaceSpace(strArray, 13);

	}
}
