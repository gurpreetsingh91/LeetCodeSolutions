package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allNumberedDisappearedinArray {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		
		List<Integer> lst = new ArrayList<Integer>();
		int len = nums.length;

		for(int i=0;i<len;i++){
			nums[(nums[i]-1)%len] = nums[(nums[i]-1)%len] + len; 
		}
		for(int j=0;j<len;j++){
			if(nums[j] <= len)
				lst.add(j+1);
		}
		return lst;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> res = findDisappearedNumbers(arr);
		System.out.println(res.toString());
	}
}
