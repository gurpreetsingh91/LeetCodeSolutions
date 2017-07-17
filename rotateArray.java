package LeetCode;

public class rotateArray {

	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		if (k >len) {
			k= k%len;
		}
		int index = len - k, start = 0;

		int[] newArr = new int[len];
		for (int j = index; j < len; j++) {
			newArr[start] = nums[j];
			start++;
		}
		for (int p = 0; p < index; p++) {
			newArr[start] = nums[p];
			start++;
		}

		for (int m = 0; m < len; m++) {
			nums[m] = newArr[m];
			 System.out.print(nums[m] + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		//int[] arr = { -1 };
		rotate(arr, 2);
	}
}
