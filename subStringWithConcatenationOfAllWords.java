package LeetCode;

import java.util.List;

public class subStringWithConcatenationOfAllWords {

	public static List<Integer> findSubstring(String s, String[] words) {
        
		String st = "";
		for(int i=0;i<words.length;i++){
			st = st + words[i];
		}
		int res = s.indexOf("barfoo", 5);
		System.out.println(res);
		return null;
    }
	public static void main(String[] args) {
		String str = "barfoothefoobarman";
		String[] words = {"foo", "bar"};
		List<Integer> res = findSubstring(str,words);
		
		
	}
}
