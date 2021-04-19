package interview;

import java.util.Set;
import java.util.TreeSet;

public class StockProblem {

	public static void main(String[] args) {
		int result = calculateNetProfitCount(3, 14, 15);
		System.out.println("The result is: " + result);
	}

	public static int calculateNetProfitCount(int n, int min, int max) {
		Set<Integer> intSet = new TreeSet<Integer>();
		if (n > 2) {
			for (int i = min; i <= max; i++) {
				if (n > 3) {
					for (int j = min; j <= max; j++) {
						intSet.add(min + max + i + j);
					}
				} else {
					intSet.add(min + max + i);
				}
			}
		} else {
			intSet.add(min + max);
		}
		return intSet.size();
	}
}