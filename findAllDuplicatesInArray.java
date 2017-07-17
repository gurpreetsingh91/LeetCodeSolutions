package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicatesInArray {

	public static List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> lst = new ArrayList<Integer>();
		int len = nums.length;

		for(int i=0;i<len;i++){
			nums[(nums[i]-1)%len] = nums[(nums[i]-1)%len] + len; 
		}
		for(int j=0;j<len;j++){
			if(nums[j] > 2*len)
				lst.add(j+1);
		}
		return lst;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> res = findDuplicates(arr);
		System.out.println(res.toString());
	}
}
