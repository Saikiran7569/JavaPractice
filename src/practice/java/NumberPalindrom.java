package practice.java;

public class NumberPalindrom {

	public static void main(String[] args) {
	
		int num = 343443434;
		int number = num ;
		int reverse = palindromOrnot(num);
		if(number == reverse)
		System.out.println(number + " Palindrom ");
		else
			System.out.println(number + " Not Palindrom ");
		
	}

	private static int palindromOrnot(int num) {
		int rev = 0;
		while(num != 0) {
			int temp = num % 10;
			rev = rev*10+ temp;
			num = num/10;
		}
		return rev;
	}

}
