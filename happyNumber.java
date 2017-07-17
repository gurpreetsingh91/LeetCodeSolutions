package LeetCode;

public class happyNumber {

	 public static boolean isHappy(int n) {
	 
		 String temp = Integer.toString(n);
		 int num =100 , sum = 0;
		 while(num-- != 0){
			 
			 for(int i=0;i<temp.length();i++){
				 
				 sum =  sum + (temp.charAt(i)-'0') * (temp.charAt(i)-'0');
			 }
			 if(sum == 1)
				 return true;
			 
			 temp = Integer.toString(sum);
			 sum=0;
		 }
		 
		 return false;
	 }
	 
	public static void main(String[] args) {
		boolean res = isHappy(0);
		System.out.println(res);
	}
}
