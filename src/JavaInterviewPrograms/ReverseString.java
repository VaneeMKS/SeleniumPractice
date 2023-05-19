package JavaInterviewPrograms;

public class ReverseString {

	public void reverseAString(String input) {
//    	print reverse of a string
		String reverse = "";
		for (int i = 0; i < input.length(); i++) {
			reverse = input.charAt(i) + reverse;

		}
		System.out.println(reverse);
	}

	public void reverseSentence(String input) {
		String[] s = input.split(" ");
		String reverse = "";
		for (int i = 0; i < s.length; i++) {
			reverse = s[i] + " " + reverse;
		}
		System.out.println(reverse);
	}

	public void reverseAString_StringBuilder(String input) {

		StringBuilder s = new StringBuilder(input);
		StringBuilder reverse = s.reverse();
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String input = "vanee girl";
		r.reverseAString(input);
		r.reverseSentence(input);
		r.reverseAString_StringBuilder(input);
	}

}
