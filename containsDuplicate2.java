package LeetCode;

import java.util.HashMap;

public class containsDuplicate2 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		int len = nums.length;
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		if (len == 0 || len == 1)
			return false;
		for (int i = 0; i < len; i++) {

			if (hMap.get(nums[i]) == null) {
				hMap.put(nums[i], i);
			} else {
				if (Math.abs(hMap.get(nums[i]) - i) <= k) {
					return true;
				}
				else
					hMap.put(nums[i], i);
			}
		}

		return false;
	}

	public static void main(String[] args) {

		//int[] arr = { 14, 15, 17, 2, 3, 4, 3, 5, 6, 7 };
		int[] arr = { 1,0,1,1};
		boolean res = containsNearbyDuplicate(arr, 1);
		System.out.println(res);
	}
}
