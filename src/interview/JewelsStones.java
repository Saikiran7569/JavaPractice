package interview;

public class JewelsStones {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAddaaddddd";
		int jewels = numJewelsInStones(J, S);

		System.out.println(jewels);

	}

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		char[] je = J.toCharArray();
		char[] ss = S.toCharArray();
		for (int i = 0; i < je.length; i++) {
			for (int j = 0; j < ss.length; j++) {
				if (je[i] == ss[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
