package practice.java;

public class BinarySearch {

	public static void main(String[] args) {
		int[] num_array = { 2, 4, 7, 10, 15, 16, 19 };

		int index = search(num_array, 10);
		System.out.println("Number found at index "+index);
	}

	private static int search(int[] num_array, int target) {

		if(num_array.length == 0 ) return -1;
		
		int low = 0;
		int high = num_array.length-1;
		
		while(low <= high) {
			int mid = low+ (high-low)/2 ;
			if(num_array[mid] == target) {
				return mid;
			}else if(num_array[mid] > target) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		
		return -1;
	}

}
