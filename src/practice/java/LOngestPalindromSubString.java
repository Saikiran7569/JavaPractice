package practice.java;

public class LOngestPalindromSubString {

	public static void main(String[] args) {
		String s= "abcdcba";
		
		String palindrom="";
		int length = 0;
		
		for(int i=0;i<= s.length()-1;i++){
			
			for(int j=1; j<= s.length()-2 ; j++) {
				String subString = s.substring(i,j);
				if(checkPalindromOrnot(subString)) 
				{
					if(subString.length() > length) {
						palindrom = subString;
						length =  subString.length();
					}
					
				}
				
			}
		}
		
				

	}

	private static boolean checkPalindromOrnot(String s) {
		StringBuffer sb = new StringBuffer(s);
		String reverse = sb.reverse().toString();
		if(s.equals(reverse)) {
			return true;
		}
		
		return false;
	}

}
