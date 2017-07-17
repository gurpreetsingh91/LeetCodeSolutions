package LeetCode;

public class peakElement {

	public static int findPeakElement(int[] nums) {
		int len = nums.length;
		
		if(len==1)
			return 0;
		
		for(int i=1;i<len;i++){
			if(nums[i]<nums[i-1])
				return i-1;
		}
		
		return len-1;
	}

	public static void main(String[] args) {

		int[] arr = {3};
		int res = findPeakElement(arr);
		System.out.println(res);
	}
}
