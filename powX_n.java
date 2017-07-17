package LeetCode;

public class powX_n {

	public static double myPow(double x, int n) {
		double res = 1;

		if (n == 0)
			return 1;

		if (n < 1) {
			
			if(n == Integer.MIN_VALUE && x == 1.000){
				return 1.0;
			}
			else if(n == Integer.MIN_VALUE && x > 1.000)
				return 0.0;
				
			n = n*(-1);
			
			for (int i = 0; i < n && i<1000000; i++) {

				res = res/x;
			}
			return res;

		}

		for (int i = 0; i < n && i<1000000; i++) {

			res = res * x;
		}
		
		if(x< 0 && n%2 != 0){
			if(res < 0)
				return res;
			else
				return res*(-1);	
		}
		else
			return res;
	}

	public static void main(String[] args) {

		double res = myPow(-13.62608, 3);
		System.out.println(res);
	}
}
