package LeetCode;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {

		int len = nums.length;
		for (int i = 0; i < len; i++) {

			if (target < nums[i])
				return i ;
			else if (target == nums[i])
				return i;
		}
		return len;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6 };
		int res = searchInsert(arr, 0);
		System.out.println(res);
	}
}
