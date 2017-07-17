package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KdiffPairsInAnArray {

	public static int findPairs(int[] nums, int k) {

		Set<String> hSet = new HashSet<String>();
		int len = nums.length;
		Arrays.sort(nums);
		int[][] arrTemp = new int[1][2];
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {

				if (nums[i] >= 0 && nums[j] >= 0) {
					if (Math.abs(nums[i] - nums[j]) == k) {

						arrTemp[0][0] = nums[i];
						arrTemp[0][1] = nums[j];
						hSet.add(arrTemp[0][0]+","+arrTemp[0][1]);
					}
				} 
				if (nums[i] <= 0 && nums[j] <= 0) {
					if (Math.abs(nums[i] - nums[j]) == k) {

						arrTemp[0][0] = nums[i];
						arrTemp[0][1] = nums[j];
						hSet.add(arrTemp[0][0]+","+arrTemp[0][1]);
					}

				} 
				if (nums[i] <= 0 && nums[j] >= 0) {
					if (Math.abs(nums[j] - nums[i]) == k) {

						arrTemp[0][0] = nums[i];
						arrTemp[0][1] = nums[j];
						hSet.add(arrTemp[0][0]+","+arrTemp[0][1]);
					}

				}
				if (nums[i] >= 0 && nums[j] <= 0) {
					if (Math.abs(nums[i] - nums[j]) == k) {

						arrTemp[0][0] = nums[i];
						arrTemp[0][1] = nums[j];
						hSet.add(arrTemp[0][0]+","+arrTemp[0][1]);
					}

				}

			}
		}
		return hSet.size();
	}

	public static void main(String[] args) {
		int[] arr = { -3,-2,-1,1,1,3, 4,5};
		int res = findPairs(arr, 2);
		System.out.println(res);

	}
}
