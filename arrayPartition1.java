package LeetCode;

import java.util.Arrays;

public class arrayPartition1 {

	public static int arrayPairSum(int[] nums) {
        
		int len = nums.length ,sum=0;
		Arrays.sort(nums);
		for(int i=0;i<len;i++){
			
			sum = sum + Math.min(nums[i], nums[i+1]);
			i=i+1;
		}
		
		return sum;
    }
	public static void main(String[] args) {
		
		//int[] arr = {1,4,3,2};
		int[] arr = {1,2,3,4};
		int res = arrayPairSum(arr);
		System.out.println(res);
	}
}
