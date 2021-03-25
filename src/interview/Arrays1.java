package interview;

import java.util.ArrayList;

public class Arrays1 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 4,2,1 };
		int[] result = decompressRLElist(nums);
		
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public static int[] decompressRLElist(int[] nums) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i += 2) {
			for (int j = 0; j < nums[i]; j++) {
				list.add(nums[i + 1]);

			}
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}

		return res;

	}
}
