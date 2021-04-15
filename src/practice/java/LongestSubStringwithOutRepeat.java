package practice.java;

import java.util.HashSet;

public class LongestSubStringwithOutRepeat {

	public static void main(String[] args) {
		String str = "abcdab";
		String longest = longestString(str);
		System.out.println(longest);
	}

	private static String longestString(String str) {
		HashSet<Character> set = new HashSet<Character>();
		String longest="";
		String longestTillnow= "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char c= str.charAt(i);
			
			if(set.contains(c)) {
				longestTillnow = "";
				set.clear();
			}
			longestTillnow +=c;
			set.add(c);
			if(longestTillnow.length() > longest.length())
			{
				longest =  longestTillnow;
			}
			
		}
		return longest;
		
	}

}
