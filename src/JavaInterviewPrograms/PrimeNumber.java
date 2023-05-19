package JavaInterviewPrograms;

import java.util.Arrays;

public class PrimeNumber {

	public static void findPrimeFromArray(int[] n) {
		int count = 0, flag = 0;
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			count = 0;
			flag = 0;
			for (int j = 1; j <= n[i]; j++) {
				if ((n[i] % j == 0)) {
					count++;
					if (count > 2) {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0) {
				System.out.println(n[i]);
			}

		}
	}

	public static void primeNumberSequence(int n) {

		int count = 0;
		for (int i = 1; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if ((i % j == 0)) {
					count++;
				}
			}
			if (count > 1) {
				continue;
			} else {
				System.out.println(i);
			}

		}
	}

	public static void checkPrimeNumber(int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println(n + " is not Prime number");
		} else {
			System.out.println(n + " is Prime number");
		}

	}

	public static void main(String[] args) {
//		checkPrimeNumber(23);
//		primeNumberSequence(16);

		int[] n = { 1, 2, 3, 5, 4, 434, 23, 13, 45 };
		findPrimeFromArray(n);

	}
}
