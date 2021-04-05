package practice.java;

public class StringTest {

	public static void main(String[] args) {
		String input = "break3ing news5: 1A 1 circle is round";

		String output = removeIntegerAndCaps(input);

		System.out.println(output);
	}

	private static String removeIntegerAndCaps(String input) {
		String[] str_arr = input.split(" ");
		StringBuilder outPut = new StringBuilder();
		for (String s : str_arr) {

			char[] char_arr = s.toCharArray();
			int count = 0;
			outPut.append(" ");
			for (char c : char_arr) {

				if (Character.isDigit(c)) {
					continue;
				} else {
					if (count == 0) {
						outPut.append(Character.toUpperCase(c));
						count++;
					} else {
						outPut.append(c);
						count++;
					}
				}
			}

		}

		return outPut.toString();
	}

}
