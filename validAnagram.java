package LeetCode;

import java.util.Arrays;

public class validAnagram {

	public static boolean isAnagram(String s, String t) {
		char[] sCharArr = s.toCharArray();
		Arrays.sort(sCharArr);
		String sSorted = new String(sCharArr);
		char[] tCharArr = t.toCharArray();
		Arrays.sort(tCharArr);
		String tSorted = new String(tCharArr);

		if (sSorted.equals(tSorted))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		boolean res = isAnagram(s, t);
		System.out.println(res);

	}
}
