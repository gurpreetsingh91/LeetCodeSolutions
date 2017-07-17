package LeetCode;

import java.util.Arrays;

public class removeElement {

	public static int removeElement(int[] nums, int val) {

		int len = nums.length;
		int ttlLen = nums.length;
		int corrLen = 0;
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {

			if (nums[i] == val) {
				ttlLen--;
				corrLen++;
				nums[i] = Integer.MIN_VALUE;
			}
		}
		int start = 0;
		for (int p = 0; p < len; p++) {
			if (nums[p] == Integer.MIN_VALUE) {
				start = p;
				int startCon = start + corrLen;
				for (int j = startCon; j < len; j++) {

					nums[start++] = nums[j];
				}

				break;

			}
		}

		return ttlLen;
	}

	public static void main(String[] args) {

		int[] arr = { 3,2,2,3 };
		int res = removeElement(arr, 3);
		for (int k = 0; k < res; k++) {
			System.out.print(arr[k] + " ");
		}

		// System.out.println(res);
	}
}
