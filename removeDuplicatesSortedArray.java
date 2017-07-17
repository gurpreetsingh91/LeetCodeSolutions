package LeetCode;

public class removeDuplicatesSortedArray {

	public static int removeDuplicates(int[] nums) {

		int len =nums.length;
		if(len==1)
			return 1;
		
		for(int i=1;i<len;i++){
			
			if(nums[i]==nums[i-1]){
				
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		int[] arr = { 2,2,3,3 };
		int res = removeDuplicates(arr);
		for (int k = 0; k < res; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
