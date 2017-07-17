package LeetCode;

import java.util.Arrays;

public class firstMissingPositive {

	public static int firstMissingPositive(int[] nums) {
		int len = nums.length;
		Arrays.sort(nums);
		for(int i=1;i<len;i++){
			if(nums[i] > 0 && nums[i] != nums[i-1]+1)
				return nums[i-1]+1;
		}
		
		return 0;
	}

	public static void main(String[] args) {

		int[] arr = {1,2,0};
		int res = firstMissingPositive(arr);
		System.out.println(res);
	}
}
