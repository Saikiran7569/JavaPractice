package interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, 3, 9, 12, 5 };

		int[] result = twoSum(arr, 12);

		System.out.println(result[0] + "," + result[1]);

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (map.containsKey(comp)) {
				return new int[] { map.get(comp), i };
			}
			map.put(nums[i], i);

		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
