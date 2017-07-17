package LeetCode;

import java.util.Arrays;

public class maxProdOfThreeNumbers {

	public static int maximumProduct(int[] nums) {

		int len = nums.length, maxProd1, maxProd2;
		Arrays.sort(nums);

		maxProd1 = nums[0] * nums[1] * nums[len - 1];
		maxProd2 = nums[len - 1] * nums[len - 2] * nums[len - 3];

		if (maxProd1 >= maxProd2)
			return maxProd1;
		else
			return maxProd2;
	}

	public static void main(String[] args) {
		int[] num = { 1,2,3,4 };
		int sum = maximumProduct(num);
		int res = sum;
		System.out.println(res);
	}
}
