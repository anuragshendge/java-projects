package anurag.arraysAndStrings.org;

public class MyStringBuffer {

	private int capacity;
	private int lengthStr;
	private char[] buffer;

	public MyStringBuffer() {
		capacity = 16;
		lengthStr = 0;
		buffer = new char[capacity];
	}

	public MyStringBuffer(String str) {
		capacity = 16;
		lengthStr = str.length();
		if (capacity < str.length())
			capacity = Math.max(2 * capacity, lengthStr);
		buffer = new char[capacity];

		for (int i = 0; i < lengthStr; i++)
			buffer[i] = str.charAt(i);
	}

	public synchronized MyStringBuffer append(String str) {
		String s = str;
		if (s == null)
			s = "null";

		if (capacity < lengthStr + str.length()) {
			int l = Math.max(lengthStr + str.length(), 2 * capacity);
			capacity = l;
			char[] b = new char[l];
			for (int i = 0; i < lengthStr; i++)
				b[i] = buffer[i];
			buffer = b;
			
			
		}
		for(int i=0; i<str.length();i++)
			buffer[lengthStr+i] = str.charAt(i);
		lengthStr += str.length();
		return this;
	}

	public String toString() {
		return new String(buffer, 0, lengthStr);
	}

}
