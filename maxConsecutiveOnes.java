package LeetCode;

public class maxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {

		int len, count = 0, maxCount = 0;
		len = nums.length;

		for (int i = 0; i < len; i++) {

			if (nums[i] == 1) {
				count++;
			} else {
				if (count > maxCount)
					maxCount = count;
				count = 0;

			}
		}
		if (count > maxCount)
			maxCount = count;

		return maxCount;
	}

	public static void main(String[] args) {

		int[] arr = { 1,0,1,1,0,1};
		int res = findMaxConsecutiveOnes(arr);
		System.out.println(res);
	}
}
