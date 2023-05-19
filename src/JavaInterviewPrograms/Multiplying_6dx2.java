package JavaInterviewPrograms;

import java.util.Arrays;

public class Multiplying_6dx2 {

	public static void main(String[] args) {
		/*
		 * Check when multiplying a 
		 * six-digit number with 2 gives a number that 
		 * has all the same numbers. 
		 * For example, 142857 x 2 = 285714
		 */
		
		String six="142857";
		int num=2;
		int output=0;
		char[] sixChar=six.toCharArray();
		Arrays.sort(sixChar);
		System.out.println("String value is: " +six);
		
		output=Math.multiplyExact(num, Integer.parseInt(six));
		System.out.println("Multiplied value of: "+six+" and "+ num+" is "+output);
		
		String value=Integer.toString(output);
		char[] valueChar=value.toCharArray();
		Arrays.sort(valueChar);
		
		
		if(String.valueOf(valueChar).equals(String.valueOf(sixChar)))
		{
			System.out.println("True: Output has all the same numbers as input");
		}
		else
		{
			System.out.println("False: Output has no same numbers as input");
		}
	}
}
