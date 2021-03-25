package interview;

import java.util.HashMap;

public class FirstNonRepetingCharacter {

	public static void main(String[] args) {
		String s = "fgkfjdhbvfdv";
		char result = firstNonRepeatingCharacter(s);
		System.out.println(result);

	}

	private static char firstNonRepeatingCharacter(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for(Character c : s.toCharArray()) {
			if(map.get(c) == 1) return c;
				
		}
		return '_';
	}

}
