package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Testing {

	public static void main(String args[]) {
		String reversewords = reverseWords("hd sgf dhi fdj");
		String reverseString = reverseString("hd sgf dhi fdj");
		
		System.out.println(reversewords);
		System.out.println(reverseString);
		
	}

	public static String reverseWords(String sentence) {
		List<String> words = Arrays.asList(sentence.split(" "));
		Collections.reverse(words);
		System.out.println("After rever coll "+ words);
		StringBuilder sb = new StringBuilder(sentence.length());
		for (int i = 0 ; i < words.size() ;  i++) {
			sb.append(words.get(i));
			sb.append(' ');
		}
		return sb.toString().trim();
	}

	public static String reverseString(String line) {
		if (line.trim().isEmpty()) {
			return line;
		}
		StringBuilder reverse = new StringBuilder();
		String[] sa = line.trim().split("\\s");
		for (int i = sa.length - 1; i >= 0; i--) {
			reverse.append(sa[i]);
			reverse.append(' ');
		}
		return reverse.toString().trim();
	}
}