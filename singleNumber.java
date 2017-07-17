package LeetCode;

public class singleNumber {

	public static int singleNumber(int[] nums) {
		
		int len = nums.length ;
		if(len == 0)
			return -1;
		if(len == 1)
			return nums[0];
		int num =nums[0];
		for(int i=1;i<len;i++){
			num = num^nums[i];
		}
		return num;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,1,5,6,5,6};
		int res = singleNumber(arr);
		System.out.println(res);
	}
}
