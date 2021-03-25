package interview;

import java.util.Arrays;

public class SortedSqureArray {

	public static void main(String[] args) {
		
		int[] nums = {-5,-4,-1,1,3,6};
		int[] sortedAndSqureNums = suqreAndSort(nums);
		
		System.out.println(Arrays.toString(sortedAndSqureNums));

	}

	private static int[] suqreAndSort(int[] nums) {
		int[] result = new int[nums.length];
		int left =0;
		int right= nums.length-1;
		
		for(int i = nums.length-1 ; i > 0 ; i --) {
			
			if(Math.abs(nums[left]) > nums[right]) {
				result[i] = nums[left] * nums[left];
				left++;
			}else {
				result[i] = nums[right] * nums[right];
				right--;
			}
		}
		
		return result;
	}

}
