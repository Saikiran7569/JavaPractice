package practice.java;

import java.util.HashMap;

public class DuplicatedCharacters {

	public static void main(String[] args) {
		String s = "saikiran bachu saikiran bachu";
		HashMap<Character, Integer> findingDuplicateChars = findingDuplicateChars(s);
		
		findingDuplicateChars.forEach((K,V)->{
		System.out.print(K+" : ");
		System.out.println(V);
		}
		);

	}

	private static HashMap<Character,Integer> findingDuplicateChars(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();

		char[] charArray = s.toCharArray();
		for (char c : charArray) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);
			}

		}
		return hm;
	}

}
