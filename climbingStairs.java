package LeetCode;

import java.util.HashMap;

public class climbingStairs {
	static HashMap<Integer,Integer> hMap = new HashMap<>();
	static int[] fibs = new int[2];
	
	public static int fib(int num){
		Integer fib = null;
		if(num <=1)
			return 1;
		else{
			if((fib=hMap.get(num-1))== null){
				fib = fib(num-1);
				hMap.put(num-1, fib);
			}
		}
			return fib +fib(num-2);
	}
	
	public static void initFibs(int num){
		fibs = new int[num];
		fibs[0]=0; fibs[1]=1;
		for(int i=2; i< num ; i++){
			fibs[i] = fibs[i-1] + fibs[i-2];
		}
	}
	
	public static int climbStairs1(int n) {
		initFibs(n+2);
		int res = fibs[n+1];
		return res;
    }
	
public static  int climbStairs(int n) {
		
        
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        
        int fib0=1, fib1=2;
        
		for(int i=3; i<= n ; i++){
			int temp = fib1;
			fib1 += fib0;
			fib0= temp;
            
		}
		
		return fib1;
    }
	public static void main(String[] args) {
		int res = climbStairs(4);
		System.out.println(res);
	}
}
