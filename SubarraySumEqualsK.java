package LeetCode;

public class SubarraySumEqualsK {

	public static int subarraySum(int[] nums, int k) {

		int len = nums.length, sum = 0, count = 0;
		for (int i = 0; i < len; i++) {

			sum = nums[i];
			if(sum==k)
				count++;
			
      			for (int j = i + 1; j < len; j++) {

				sum = sum + nums[j];
				if (sum == k) {
					count++;
				}
			}
			sum = 0;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2,3};
		int res = subarraySum(arr, 3);
		System.out.println(res);
	}
}
