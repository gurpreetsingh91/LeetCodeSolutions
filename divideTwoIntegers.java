package LeetCode;

public class divideTwoIntegers {

	public static int divide(int dividend, int divisor) {
		
		int count =0,sum = 0;
		while(sum < dividend){
			sum = sum+ divisor;
			count++;
		}
		
		if(sum == dividend)
			return count;
		else
			return count-1;
		
    }
	public static void main(String[] args) {
		int res = divide(0,2);
		System.out.println(res);
	}
}
