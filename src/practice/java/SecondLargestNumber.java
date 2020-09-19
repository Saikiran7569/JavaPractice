package practice.java;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] num = {1,5,4,2,8,55,4,33};
		int secondNum = findSecondLargestNumber(num);
		
		System.out.println("Second Number : "+ secondNum);

	}

	private static int findSecondLargestNumber(int[] num) {
		int first = 0;
		int second = 0;
		
		for(int i : num) {
			if(i>first) {
				first = i;
			}else if(i> second ) {
				second = i;
			}
		}
		return second;
	}

}
