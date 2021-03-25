package interview;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 3, 0 };
		int missnumber = missingMunber(num);
		System.out.println("Missting Number "+ missnumber);
		int missnumber1 = missingMunber1(num);
		System.out.println("Missting Number*** "+ missnumber1);
		
		

	}

	private static int missingMunber(int[] num) {
		HashSet<Integer> hm = new HashSet<>();
		for (int i : num) {
			hm.add(i);
		}

		for (int i = 0; i <= num.length; i++) {
			if (!hm.contains(i)) {
				return i;
			}

		}
		return -1;
	}
	
	private static int missingMunber1(int[] num) {
		int sum=0;
		for (int i : num) {
			sum += i;
		}
		int n=num.length+1;
		
		return (n*(n-1)/2) -sum;
	}
}
