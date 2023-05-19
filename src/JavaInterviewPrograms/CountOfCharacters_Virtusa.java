package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountOfCharacters_Virtusa {

	public static void main(String[] args) {
		String str = "aabbGAAccaAbBdaDDbbcceF";

		int count = 0;

		String str1 = str.toLowerCase();

		System.out.println("String is: " + str);
		Set s = new LinkedHashSet<String>();
		for (int i = 0; i < str1.length(); i++) {
			s.add(str1.charAt(i));
		}

		Object[] arr = s.toArray();
		String a = "";
		for (int i = 0; i < arr.length; i++) {
			a = a + arr[i];
		}
		System.out.println("After duplicate removals: " + a);

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			count = 0;
			for (int j = 0; j < str1.length(); j++) {
				if (a.charAt(i) == str1.charAt(j)) {
					count++;
				}
			}

			map.put(a.charAt(i), count);
		}
		System.out.println("Count of each characters: " + map);

	}

}
