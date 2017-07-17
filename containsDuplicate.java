package LeetCode;

import java.util.Arrays;

public class containsDuplicate {

	public static boolean containsDuplicate(int[] nums) {

		int len = nums.length;
		Arrays.sort(nums);
		
		if(len==1)
			return false;
		
		for(int i=1;i<len;i++){
			if(nums[i] == nums[i-1])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 3 ,4,5,6,7,8,9};
		boolean res = containsDuplicate(arr);
		System.out.println(res);
	}
}
