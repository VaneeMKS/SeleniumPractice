package JavaInterviewPrograms;

public class FindBinaryValue {

	public static void main(String[] args) {
		int num = 99;
		String binary_str = Integer.toBinaryString(num);
		System.out.println(binary_str);

		int i = binary_str.length() - 1;
		while (binary_str.charAt(i) == '0') {
			i--;
		}
		int length = 0;
		int count = 0;
		for (i = binary_str.length() - 1; i >= 0; i--) {
			if (binary_str.charAt(i) == '0') {
				count++;
			} else {
				length = Math.max(length, count);
				count = 0;
			}
		}
		length = Math.max(length, count);
		System.out.println("\nLength of the longest sequence of 0: " + length);
	}

}
