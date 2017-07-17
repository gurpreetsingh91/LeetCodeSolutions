package LeetCode;

import java.util.HashMap;

public class isomorphicString {

	/**
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isIsomorphic(String s, String t) {
		
		HashMap<Character,Character> hMap = new HashMap<Character,Character>();
		
		int lenS = s.length(), lenT = t.length();
		boolean res,res1 ;
		if(lenS != lenT)
			return false;
		
		res = true;
		
		for(int i=0;i<lenS;i++){
			
			if(!hMap.containsKey(s.charAt(i))){
				hMap.put(s.charAt(i), t.charAt(i));
			}
			else if(hMap.containsKey(s.charAt(i))){
				
				if(hMap.get(s.charAt(i)) != t.charAt(i))
					res =  false;
			}
			
		}
		hMap.clear();
		res1 =  true;
		for(int i=0;i<lenT;i++){
			
			if(!hMap.containsKey(t.charAt(i))){
				hMap.put(t.charAt(i), s.charAt(i));
			}
			else if(hMap.containsKey(t.charAt(i))){
				
				if(hMap.get(t.charAt(i)) != s.charAt(i))
					res1 =  false;
			}
			
		}
		
		
		if(res && res1)
			return true;
		else
			return false;
    }
	public static void main(String[] args) {
		
		String s = "ab";
		String t = "aa";
		boolean res = isIsomorphic(s,t);
		System.out.println(res);
	}
}
