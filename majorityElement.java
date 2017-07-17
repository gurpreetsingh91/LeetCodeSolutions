package LeetCode;

import java.util.Arrays;

public class majorityElement {

	public static int majorityElement(int[] nums) {

		int len = nums.length, majorityCount = len / 2, count = 0, maxCount = 0, majorElement = 0;

		if (len == 1)
			return nums[0];

		Arrays.sort(nums);

		majorElement = nums[0];
		count = 1;
		for (int i = 1; i < len; i++) {

			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				if (count > maxCount) {
					majorElement = nums[i - 1];
					maxCount = count;
					count = 1;
				}
			}

		}
		if (count > maxCount) {
			majorElement = nums[len-1];
		}
		return majorElement;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 3 };
		int res = majorityElement(arr);
		System.out.println(res);
	}
}
