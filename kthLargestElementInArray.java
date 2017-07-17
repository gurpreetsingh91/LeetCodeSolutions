package LeetCode;

import java.util.Arrays;

public class kthLargestElementInArray {

	public static int findKthLargest(int[] nums, int k) {

		int len = nums.length;
		Arrays.sort(nums);
		
		return nums[len-k];
	}

	public static void main(String[] args) {
		int[] arr = {1};
		int res = findKthLargest(arr,1);
		System.out.println(res);
	}
}
