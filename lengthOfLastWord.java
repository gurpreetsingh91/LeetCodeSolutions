package LeetCode;

public class lengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
		
		int len = s.length(),index=0;
		
		
		if(s.equals(""))
			return 0;
		
		
		
		if(s.charAt(len-1) == ' '){
			for(int i=len-1;i>0;i--){
				
				if(s.charAt(i) != ' '){
					index = i;
					break;
				}
				
			}
			s = s.substring(0,index+1);
		}
			
		
		if(!s.contains(" ")){
			return s.length();
		}
		
		String res = (String)s.subSequence(s.lastIndexOf(" ")+1, s.length());
		return res.length();
    }

	public static void main(String[] args) {
		
		String s = "       Helloworld";
		int res = lengthOfLastWord(s);
		System.out.println(res);
		
	}

}
