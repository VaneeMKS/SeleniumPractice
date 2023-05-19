package JavaInterviewPrograms;

import java.util.Scanner;

public class Armstrong {

	public static boolean armstrong(String num) {
		int i, j, intValue = 0;
		double output = 0;
		for (i = 0; i < num.length(); i++) {
			output = intValue + Math.pow(Character.getNumericValue(num.charAt(i)), 3);
			intValue = (int) output;
		}

		if (intValue == Integer.parseInt(num)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner s = new Scanner(System.in);
		String num = s.next();

		if (armstrong(num)) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	}

}
