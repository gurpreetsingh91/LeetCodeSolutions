package LeetCode;

public class addDigits {

	public static int addDigits(int n) {
        
		String temp = Integer.toString(n);
		int num =100 , sum = 0;
		 while(temp.length() != 1){
			 
			 for(int i=0;i<temp.length();i++){
				 
				 sum =  sum + (temp.charAt(i)-'0') ;
			 }
			 
			 temp = Integer.toString(sum);
			 sum=0;
		 }
		 
        return temp.charAt(0)-'0';
    }
	public static void main(String[] args) {
		
		int res = addDigits(40);
		System.out.println(res);
	}
}
