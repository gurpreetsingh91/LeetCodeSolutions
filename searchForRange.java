package LeetCode;

public class searchForRange {

		public static int[] searchRange(int[] nums, int target) {
			int len = nums.length, done = 0, start = 0, end = 0, ttlCount = 0, count = 0;
			for (int i = 0; i < len; i++) {
	
				if (nums[i] == target)
					ttlCount++;
	
			}
			int[] res={0,0};
			if (ttlCount == 0) {
				res[0]= -1;
				res[1]= -1;
				return res;
			}
	
			for (int j = 0; j < len; j++) {
	
				if (nums[j] == target)
					count++;
				if (nums[j] == target && count == 1) {
					start = j;
				}
				if (nums[j] == target && count == ttlCount) {
					end = j;
				}
			}
			
				
			res[0] = start;
			res[1] = end;
			return res;
		}

	public static void main(String[] args) {

		int[] arr = { 2 };
		int[] res = searchRange(arr, 2);
		System.out.println(res[0] + " " + res[1]);

	}
}
