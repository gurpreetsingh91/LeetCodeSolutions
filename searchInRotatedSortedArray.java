package LeetCode;

public class searchInRotatedSortedArray {

	public static int search(int[] nums, int target) {

		int len = nums.length;

		for (int i = 0; i < len; i++) {
			if (nums[i] == target)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] ar = { 4, 5, 6, 7, 0, 1, 2 };
	}
}
