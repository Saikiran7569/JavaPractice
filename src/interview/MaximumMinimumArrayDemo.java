package interview;

import java.util.Arrays;

public class MaximumMinimumArrayDemo {
	public static void main(String args[]) {
		largestAndSmallest(new int[] { -20, 34, 21, -87, 92, 12});
		largestAndSmallest(new int[] { 10, -55, -2 });
		
	}

	public static void largestAndSmallest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Given integer array : " + Arrays.toString(numbers));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
	}
}
