package LeetCode;

public class sqrt_x {

	public static int mySqrt(int x) {
		
		if(x == 0)
			return 0;
			
		int temp ;
		long temp1 = 1 ,temp2;
		
		for(long i=1;i<x;i++){
			temp2 = i*i;
			if(temp2 > x){
				temp1 = i-1;
				break;
			}
		}
		temp  = (int)temp1;
		return temp;
    }
	public static void main(String[] args) {
		int res = mySqrt(2147395600);
		System.out.println(Integer.MAX_VALUE + " " + res);
	}
}
