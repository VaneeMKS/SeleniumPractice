package JavaInterviewPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_To_Array {

	public static void main(String[] args) {
		int ch[] = { 0, 5, 1, 2, 6, 3, 1, 3 };
		Arrays.sort(ch);
		// Array to another array
		int ch1[] = Arrays.copyOf(ch, ch.length);
		System.out.print("Array to another array: ");
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
		}
		System.out.print("\n");

		// To convert from array to Set
		Set<Integer> s = new LinkedHashSet<Integer>();
		System.out.print("Array to Set: ");
		for (int i = 0; i < ch.length; i++) {
			s.add(ch[i]);
		}
		System.out.println(s);

		// To convert set to array
		System.out.print("Set to Array: ");
		int n = s.size();
		int arr[] = new int[n];
		int i = 0;
		for (int x : s) {
			arr[i] = x;
			System.out.print(arr[i]);
		}

	}

}
