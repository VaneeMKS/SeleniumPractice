package org.interview;

public class Interview {

	public static void main(String[] args) {
		String n1 = "Good";
		String n = n1.toLowerCase();
		String output = "";
		for (int i = 0; i < n.length(); i++) {
			output = n.charAt(i) + output;
		}
		System.out.println(n);
		System.out.println(output);
		if (n.equals(output)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is Not palindrome");
		}

	}

}
