// you can also use imports, for example:
package JavaInterviewPrograms;

import java.util.Arrays;
//import java.io.*;

class SmallestPositiveMissingInteger {
	public static void main(String[] args) {
		System.out.print("{");
		int[] N = { -1, -9, -5, 3, 2 };
		for (int i = 0; i < N.length; i++) {
			if (i == N.length - 1) {
				System.out.print(N[i]);
			} else
				System.out.print(N[i] + ", ");
		}
		System.out.println("}");
		System.out.print("\n");

		SmallestPositiveMissingInteger s = new SmallestPositiveMissingInteger();
		int missing = s.solution(N);
		System.out.println("\nSmallest missing positive number: " + missing);
	}

	public int solution(int[] A) {
		int ch[] = new int[A.length];
		int min = 1, flag = 0;
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			for (int i = 0; i < A.length; i++) {
				if (i == A.length - 1) {
					min = A[i] + 1;
					break;
				}
				if (A[i] < 0 || A[i] == A[i + 1]) {
					continue;
				} else if ((A[i] + 1) != A[i + 1]) {
					min = A[i] + 1;
					break;
				}
			}
		}
		return min;
	}

}
