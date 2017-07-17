package LeetCode;

public class findMinInRotatedSortedArray {

	public static int findMin(int[] nums) {

		int len = nums.length , temp;
		
		if(len==0)
			return -1;
		
		temp = nums[0];
		
		for(int i=0;i<len;i++){
			if(nums[i] < temp){
				temp = nums[i];
			}
		}
		
		return temp;
	}

	public static void main(String[] args) {

		int[] arr = {4,5,6,7,0,1,2};
		int res = findMin(arr);
		System.out.println(res);
	}
}
