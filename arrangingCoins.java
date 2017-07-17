package LeetCode;

public class arrangingCoins {

	public static int arrangeCoins(int n) {

		long sum = 0, count = 1;
		
		while (true) {
			
			sum = (count * (count + 1)) / 2;
			
			if(sum > n){
				return (int)count-1;
			}
			else if(sum == n)
				return (int)count;
			
			count = count + 1;
		}
	}

	public static void main(String[] args) {

		int res = arrangeCoins(2147483647);
		System.out.println(res);
	}
}
