package LeetCode;

public class minInRotatedSortedArray2 {

	public static int findMin(int[] nums) {

		int len = nums.length, min;
		if (len == 1)
			return nums[0];

		min = nums[0];
		for (int i = 1; i < len; i++) {

			if (nums[i] < min) {
				return nums[i];
			}

		}

		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int res = findMin(arr);
		System.out.println(res);
	}
}
