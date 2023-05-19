package JavaInterviewPrograms;

public class LongestNumberBinarySequence {

	public static void main(String[] args) {

		int n = 1645456767;
		int count = 0, newCount = 0;
		String binValue = Integer.toBinaryString(n);
		System.out.println("Binary number of " + n + " is: " + binValue);
		for (int i = 0; i < binValue.length(); i++) {
			int num = Character.getNumericValue(binValue.charAt(i));
			if (num == 0) {
				newCount++;
			} else {
				if (newCount > count) {
					count = newCount;
				}
				newCount = 0;
			}
		}
		System.out.println("\nLength of the longest sequence: " + count);
	}
}
