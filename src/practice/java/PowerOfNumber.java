package practice.java;

public class PowerOfNumber {

	public static void main(String[] args) {
		int num = 625;
		boolean power = findPower(num,5);
		boolean power1 = findPowerForLoop(num,5);
			
		System.out.println(power);
		System.out.println(power1);

	}

	private static boolean findPowerForLoop(int num, int i) {
		if(num == 0) return false;
		while(num != 1) {
			if(num%i !=0 ) return false;
			num = num/i;
		}
		return true;
	}

	private static boolean findPower(int num,int division) {
		return Math.log(num)/Math.log(division) % 1 == 0;
	}

}
