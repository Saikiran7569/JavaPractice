package practice.java;

public class StringPalindrom {

	public static void main(String[] args) {
		String s = "asasa asasa";
		String rev = palindrom(s);
		if(s.equals(rev)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not a palindrom");
		}
	}

	private static String palindrom(String s) {
		String rev ="";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1 ; i >= 0 ; i--) {
			rev = rev+charArray[i];
			
		}
		return rev;
	}

}
