package LeetCode;

public class moveZeroes {

	public static void moveZeroes(int[] nums) {

		int len = nums.length, zeroCount = 0, counter;
		for (int i = 0; i < len; i++) {

			if (nums[i] == 0)
				zeroCount++;

		}

		counter = 0;
		for (int j = 0; j < len; j++) {

			if (nums[j] != 0) {
				nums[counter] = nums[j];
				counter++;
			}
		}
		while (counter < len) {
			nums[counter++] = 0;
					
		}

	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeroes(arr);
	}
}
