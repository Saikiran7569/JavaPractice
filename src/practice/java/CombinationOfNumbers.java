package practice.java;

import java.util.LinkedList;
import java.util.List;

public class CombinationOfNumbers {

	public static void main(String[] args) {
		String number = "273";

		List<String> output = latterCombinations(number);
		
		System.out.println(output);
	}

	private static List<String> latterCombinations(String number) {
		LinkedList<String> output = new LinkedList<String>();

		if (number.length() == 0)
			return output;

		output.add("");

		String[] char_map = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		for (int i = 0; i < number.length(); i++) {
			int index = Character.getNumericValue(number.charAt(i));
			while (output.peek().length() == i) {
				String permutation = output.remove();

				for (char c : char_map[index].toCharArray()) {
					output.add(permutation + c);
				}

			}

		}

		return output;

	}

}
