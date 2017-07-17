package LeetCode;

public class implementStrStr {

	public static int strStr(String haystack, String needle) {
		
		if(haystack.contains(needle)){
			
			return haystack.indexOf(needle);
		}
		else
			return -1;
		
    }
	public static void main(String[] args) {
		
		String str1 = "gurpreetsingh";
		String str2 = "singh";
		int res = strStr(str1,str2);
		System.out.println(res);
	}
}
