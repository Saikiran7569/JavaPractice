package interview;

public class NumbersEvenDidits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 36, 7896 };
		int result = findNumbers(nums);

		System.out.println(result);

	}

	public static int findNumbers(int[] nums) {
		int count = 0;

		for (int i : nums) {
			String s = String.valueOf(i);
			if (s.length() % 2 == 0) {
				count++;
			}

		}
		return count;
	}

}
