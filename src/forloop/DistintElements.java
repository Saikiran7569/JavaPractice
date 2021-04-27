package forloop;

import java.util.ArrayList;
import java.util.HashMap;

public class DistintElements {

	public static void main(String[] args) {
		int[] inputArray = { 1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6 };
		ArrayList<Integer> outArray = findDuplicates(inputArray);
		System.out.println(outArray);

	}

	private static ArrayList<Integer> findDuplicates(int[] inputArray) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> outArray = new ArrayList<Integer>();
		int count = 0;
		for (int i : inputArray) {
			if (hm.containsKey(i)) {
				count++;
				hm.put(i, hm.get(i) + 1);
			} else {
				outArray.add(i);
				hm.put(i, 1);
			}
		}
		
		while(count>0) {
			outArray.add(Integer.MIN_VALUE);
			count--;
		}

		return outArray;
	}

}
