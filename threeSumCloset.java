package LeetCode;

import java.util.Arrays;

public class threeSumCloset {

	public static int threeSumClosest(int[] nums, int target) {

		int len = nums.length , first,second,third, sum ,diff=0,min = Integer.MAX_VALUE,res=0;
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			
			first = i;
			second = i+1;
			third = len-1;
			
			while(second < third){
				
				sum = nums[first] + nums[second] + nums[third];
				if(sum >= 0 && target >=0){
					diff = Math.abs(sum-target);
				}
				else if(sum >= 0 && target <=0){
					diff = Math.abs(target-sum);
				}
				else if(sum <= 0 && target >=0){
					diff = Math.abs(sum-target);
				}
				else if(sum <= 0 && target <=0){
					diff = Math.abs(sum-target);
				}
				
				
				if(diff < min){
					min = diff;
					res = sum;
				}
					
				
				if(sum < target)
					second++;
				else if(sum > target)
					third--;
				else if(sum == target)
					return res;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = {-1,-1,1,1,3};
		int res = threeSumClosest(arr, -1);
		System.out.println(res);

	}
}
