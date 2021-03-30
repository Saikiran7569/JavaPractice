package practice.java;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestNumber {

	public static void main(String[] args) {
		int[] n = {23,4,33,65,65,34};
		
		int kthLargestNumber = findKthLargestNumber(n,2);
		System.out.println(kthLargestNumber);
		kthLargestNumber =  findKthLargestNumber1(n,2);
		System.out.println(kthLargestNumber+"++++");
		
	}

	private static int findKthLargestNumber1(int[] n, int i) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		for(int num : n) {
			p.add(num);
			if(p.size() > i) {
				p.remove();
			}
		}
		return p.remove();
	}

	private static int findKthLargestNumber(int[] n, int i) {
		Arrays.sort(n);
		return n[n.length-i];
	}

}
