package org.interview;

import java.util.HashMap;
import java.util.Map;

public class stringTest {

	public static void main(String[] args) {
		String input1 = "bla black blabla ck Bla Bloom Blue bLa Ba Beep Bo BLACK";
		String input = input1.toLowerCase();

		String[] arr = input.split(" ");

		Map map = new HashMap<String, Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count > 1) {
				map.put(arr[i], count);

			} else {
				continue;
			}

		}
		System.out.println(map);

	}

}
