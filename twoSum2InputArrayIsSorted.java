package LeetCode;

public class twoSum2InputArrayIsSorted {

	public static int[] twoSum(int[] numbers, int target) {
		int len = numbers.length;
		int start = 0, end = len - 1, sum;
		int res[] = new int[2];
		while (start < end) {
			sum = numbers[start] + numbers[end];
			if (sum == target) {
				res[0] = start + 1;
				res[1] = end + 1;
				break;
			} else if (sum > target) {
				end--;
			} else if (sum < target) {
				start++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int[] res = twoSum(arr, 18);
		System.out.println(res[0] + " " + res[1]);
	}
}
