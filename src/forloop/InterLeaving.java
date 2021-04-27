package forloop;

public class InterLeaving {

	public static void main(String[] args) {

		String s1 = "xxyzz";
		String s2 = "wyyzx";
		String s3 = "xxwyyyxzzz";//"xxwyyzyzxz";
		boolean output = isInterleave(s1, s2, s3);
		
		System.out.println(output);

	}

	public static boolean isInterleave(String s1, String s2, String s3) {
		return isInterleave(s1, s2, s3, 0, 0);
	}

	private static boolean isInterleave(String s1, String s2, String s3, int i, int j) {
		if (i + j > s3.length())
			return false;
		if (i + j == s3.length())
			return i == s1.length() && j == s2.length();

		if (i < s1.length() && s1.charAt(i) == s3.charAt(i + j)) {
			if (isInterleave(s1, s2, s3, i + 1, j))
				return true;
		}

		if (j < s2.length() && s2.charAt(j) == s3.charAt(i + j)) {
			if (isInterleave(s1, s2, s3, i, j + 1))
				return true;
		}

		return false;
	}
}
