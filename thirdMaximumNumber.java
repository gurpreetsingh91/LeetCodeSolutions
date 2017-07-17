package LeetCode;

import java.util.HashSet;

public class thirdMaximumNumber {

	public static int thirdMax(int[] nums) {

		int len = nums.length;
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE, temp1, temp2;
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int j=0;j<len;j++)
			hSet.add(nums[j]);
		
		for (int i = 0; i < len; i++) {

			if(nums[i] == firstMax || nums[i] == secondMax || nums[i] == thirdMax)
				continue;
				
			if (nums[i] > firstMax) {
				temp1 = firstMax;
				temp2 = secondMax;
				firstMax = nums[i];
				if (temp1 > secondMax) {
					secondMax = temp1;
					if (temp2 > thirdMax)
						thirdMax = temp2;
				}

			} else if (nums[i] > secondMax) {
				temp1 = secondMax;
				secondMax = nums[i];
				if (temp1 > thirdMax) {
					thirdMax = temp1;
				}
			} else if (nums[i] > thirdMax) {
				thirdMax = nums[i];
			}

		}
		
		if(hSet.size() ==2  || len == 2 || hSet.size() ==1  || len == 1)
			thirdMax = firstMax;

		return thirdMax;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,-2147483648};
		int res = thirdMax(arr);
		System.out.println(res);
	}
}
