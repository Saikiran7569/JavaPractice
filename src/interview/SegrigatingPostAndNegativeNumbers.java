package interview;

public class SegrigatingPostAndNegativeNumbers {

	public static void main(String[] args) {
		int[] nums = { -1, 2, -3, -6, 20, 10, -5, 6 };
		segrigateNumbers(nums);
		
		for (int i = 0; i < nums.length; i++) 
			System.out.print(nums[i] + " "); 

	}

	private static void segrigateNumbers(int[] nums) {
		int n = nums.length;
		int key, j;
		for (int i = 1; i < n; i++) {
			key = nums[i];
			if (key > 0)
				continue;
			j = i - 1;
			while (j >= 0 && nums[j] > 0) {
				nums[j + 1] = nums[j];
				j = j-1;
			}
			nums[j + 1] = key;

		}
	}
}
