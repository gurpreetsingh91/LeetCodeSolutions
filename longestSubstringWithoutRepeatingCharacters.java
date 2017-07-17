package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		Set<Character> hSet = new HashSet<Character>();
		int len = s.length(), count = 0,max = Integer.MIN_VALUE;
		if(len==0)
			return 0;
		
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {

				if (!hSet.contains(s.charAt(j))) {
					hSet.add(s.charAt(j));
					count++;
					if(count > max)
						max = count;
				}
				else{
					hSet.clear();
					count =0;
					break;
				}
			}
		}
		
		return max;
	}

	public static void main(String[] args) {

		String str = "";
		int res = lengthOfLongestSubstring(str);
		System.out.println(res);
	}
}
