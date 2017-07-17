package LeetCode;


public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		int arrLen = strs.length;
		int min = Integer.MAX_VALUE , prefLength  = 0,flag =0;
		
		//Corner Case
		if(strs.length == 0)
			return "";
		
		
		for(int i=0;i<arrLen ;i++){
			if(strs[i].length() < min){
				min = strs[i].length();
			}
		}
		//System.out.println(min);
		for(int j=0;j<min;j++){
			
			for(int k=1;k<arrLen;k++){
				if(strs[k].charAt(j) == strs[k-1].charAt(j)){
					
				}
				else{
					flag = 1;
					break;
				}
			}
			if(flag==0){
				prefLength++;
			}else{
				break;
			}
			
		}
		return strs[0].substring(0, prefLength);
	}

	public static void main(String[] args) {

		String[] arr = {"gurpreet","gurpal","gurjep","gur"};
		String res = longestCommonPrefix(arr);
		System.out.println(res);
	}
}
