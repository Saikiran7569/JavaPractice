package interview;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String romanNumber = "CIIIIIICDLI";
		int number = convertNumber(romanNumber);
		System.out.println(number);
	}

	private static int convertNumber(String romanNumber) {
		int result = 0;
		char[] romnum = romanNumber.toCharArray();
		HashMap<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		for (int i = 0; i < romnum.length-1; i++) {

			if (roman.get(romanNumber.charAt(i)) < roman.get(romanNumber.charAt(i + 1))) {
				result -= roman.get(romanNumber.charAt(i));
			} else {
				result += roman.get(romanNumber.charAt(i));
			}

		}

		return result+roman.get(romanNumber.charAt(romnum.length-1));
	}

}
