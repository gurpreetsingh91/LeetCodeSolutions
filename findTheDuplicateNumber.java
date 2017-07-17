package LeetCode;

import java.util.Arrays;

public class findTheDuplicateNumber {

	public static int findDuplicate(int[] nums) {

		int len = nums.length,temp=0;
		Arrays.sort(nums);
		if(len == 1)
			return nums[0];
		
		for(int i=1;i<len;i++){
			if(nums[i]==nums[i-1]){
				temp = nums[i];
				break;
			}
				
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5};
		int res = findDuplicate(arr);
		System.out.println(res);
	}
}
