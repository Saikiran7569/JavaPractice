package interview;

import java.math.BigDecimal;

public class CollectionDemo {

	public static void main(String[] args) {

		String d1 = "39.13";
		String d2 = "100";
		
		
		BigDecimal num1 = new BigDecimal(d1);	
		BigDecimal num2 = new BigDecimal(d2);	
		BigDecimal num3 = (num1.divide(num2));
		System.out.println(String.valueOf(num3));
		
		
		double num4 = Double.valueOf(d1);
		double num5 = Double.valueOf(d1);
		System.out.println(String.valueOf(num4/num5));
		
		float num6 = Float.valueOf(d1);
		float num7 = Float.valueOf(d1);
		System.out.println(String.valueOf(num6/num7));
		
		
		/*
		 * System.out.println(new TP());
		 * 
		 * 
		 * CollectionDemo d = new CollectionDemo(); d.start();
		 * System.out.println("one"); d.start(); System.out.println("two");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * List<Integer> l1 = new ArrayList<>(); l1.add(1); l1.add(2); l1.add(3);
		 * l1.add(5); l1.add(4);
		 * 
		 * System.out.println(Collections.binarySearch(l1, 4));
		 * 
		 */
	}

	/* synchronized TP() {} */
	/*
	 * public void run() { System.out.println("thread"); }
	 */
}

class TP {
	TP() {
	}
}
