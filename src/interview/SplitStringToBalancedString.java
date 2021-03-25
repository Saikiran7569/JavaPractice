package interview;

public class SplitStringToBalancedString {

	public static void main(String[] args) {
		String s = "RLRRRLLRLL";
		int result = balancedStringSplit(s);
		System.out.println(result);

	}

	public static int balancedStringSplit(String s) {

		int count = 0;
		int balance = 0;
		for (char c : s.toCharArray()) {
			if (c == 'R') {
				balance++;
			} else {
				balance--;
			}
			if (balance == 0) {
				count++;
			}
		}

		return count;
	}

}
