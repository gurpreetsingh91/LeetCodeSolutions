package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class four4Sum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		int len = nums.length,first , second, third,fourth;
		Arrays.sort(nums);
		for(int i=0;i<len-3;i++){
			for(int j=i+1;j<len-2;j++){
	 			first = i;
	 			second = j;
	 			third = second+1;
	 			fourth = len-1;
	 			
	 			while(third < fourth){
	 				
	 				if(nums[first] + nums[second] + nums[third] + nums[fourth]== target){
	 					List<Integer> temp = new ArrayList<Integer>();
	 					temp.add(nums[first]);
	 					temp.add(nums[second]);
	 					temp.add(nums[third]);
	 					temp.add(nums[fourth]);
	 					res.add(temp);
	 					third++;
	 					fourth--;
	 				}
	 				else if(nums[first] + nums[second] + nums[third]+ nums[fourth]< target)
	 					third++;
	 				else if(nums[first] + nums[second] + nums[third]+ nums[fourth] > target)
	 					fourth--;
	 			}
	 			
	 			
	 		
			}
		}
 		resList.addAll(res);
 		
		return resList;
		
    }
	public static void main(String[] args) {
		int[] arr = {0,0,0,0};
		List<List<Integer>> res = fourSum(arr,1);
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i).toString());
		}
	}
}
