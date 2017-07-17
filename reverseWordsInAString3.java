package LeetCode;

import java.util.StringTokenizer;

public class reverseWordsInAString3 {

	public static String reverseWords(String s) {
		int len = s.length();
		String finalString = "";
		StringTokenizer str = new StringTokenizer(s, " ");
		while(str.hasMoreTokens()){
			
			String str1 = (String)str.nextToken();
			finalString = finalString + new StringBuilder(str1).reverse().toString() + " ";
			
		}
		
		return finalString.substring(0, len);
    }

	public static void main(String[] args) {
		
		String str = "Let's take LeetCode contest";
		String res = reverseWords(str);
		System.out.println(res);
	}
}
