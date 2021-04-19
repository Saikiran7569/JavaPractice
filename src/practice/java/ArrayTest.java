package practice.java;

import java.util.HashMap;

public class ArrayTest {

	public static void main(String[] args) {
		int number = 3;
		int[] intarray = {1,5,76,20,23,54,200,23,32};
		
		String outStr = finOutString(number,intarray);
		System.out.println(outStr);

	}

	private static String finOutString(int number, int[] intarray) {
		int numberOfGroups = intarray.length/number;
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		hm.put(1, 'A');hm.put(2, 'B');hm.put(3, 'C');hm.put(4, 'D');hm.put(5, 'E');hm.put(6, 'F');hm.put(7, 'G');
		hm.put(8, 'H');hm.put(9, 'I');hm.put(10, 'J');hm.put(11, 'K');hm.put(12, 'L');hm.put(13, 'M');hm.put(14, 'N');
		hm.put(15, 'O');hm.put(16, 'P');hm.put(17, 'Q');hm.put(18, 'R');hm.put(19, 'S');hm.put(20, 'T');hm.put(21, 'U');
		hm.put(22, 'V');hm.put(23, 'W');hm.put(24, 'X');hm.put(25, 'Y');hm.put(26, 'Z');
		
		String out = "";
		int count = 0;
		while(count<intarray.length) {
			int num = intarray[count];
			if(num%10 == 0) {
				int result = num/10;
				out = out.concat(hm.get(result).toString());
			}else {
				out = out.concat("-");
			}
			count += numberOfGroups;
			
		}
		
		
		
		
		return out;
	}

}
