package interview;

public class SubtractProductSum {

	public static void main(String[] args) {
		int n = 1234;
		int result = subtractProductAndSum(n);
		System.out.println(result);
	}

	public static int subtractProductAndSum(int n) {

		int product = 1;
		int sum = 0;

		while (n > 0) {
			product *= n % 10;
			sum += n % 10;
			n /= 10;
		}

		return product - sum;
	}
}
