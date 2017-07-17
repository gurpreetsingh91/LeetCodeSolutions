package LeetCode;

public class searchInRotatedSortedArray2 {

	public static boolean search(int[] nums, int target) {

		int len = nums.length;
		for(int i=0;i<len;i++){
			if(nums[i]==target)
				return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 6, 7, 0, 1, 2};
		boolean res = search(arr);
		
	}
}
