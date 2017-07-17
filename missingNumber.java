package LeetCode;

import java.util.Arrays;

public class missingNumber {

	public static int missingNumber(int[] nums) {
		int len =nums.length;
		Arrays.sort(nums);
		for(int i=1;i<len;i++){
			if(nums[i] -nums[i-1] == 2 )
				return nums[i]-1;
		}
		
		for(int j=0;j<len;j++){
			if(nums[j]==0)
				return len;
			
			if(nums[j]==len)
				return 0;
		}
		
		return 0;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 1 ,3};
		int res = missingNumber(arr);
		System.out.println("Missing no. " + res);

	}
}
