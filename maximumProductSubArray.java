package LeetCode;

public class maximumProductSubArray {

	public static int maxProduct(int[] nums) {

		int len = nums.length , maxProduct =1;
		for (int i = 0; i < len-1; i++) {

			for (int j = i + 1; j < len; j++) {

				//maxProduct = maxProduct * nums[j]
			}
		}

		return 0;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, -2, 4 };
		int res = maxProduct(arr);
	}
}
