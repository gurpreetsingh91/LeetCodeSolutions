package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Three3Sum {

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		Set<List<Integer>> res = new HashSet<List<Integer>>();
 		int len = nums.length,first , second, third;
 		Arrays.sort(nums);
 		for(int i=0;i<len;i++){
 			first = i;
 			second = i+1;
 			third = len-1;
 			while(second < third){
 				
 				if(nums[first] + nums[second] + nums[third] == 0){
 					List<Integer> temp = new ArrayList<Integer>();
 					temp.add(nums[first]);
 					temp.add(nums[second]);
 					temp.add(nums[third]);
 					res.add(temp);
 					second++;
 					third--;
 				}
 				else if(nums[first] + nums[second] + nums[third] < 0)
 					second++;
 				else if(nums[first] + nums[second] + nums[third] > 0)
 					third--;
 			}
 			
 			
 		}
 		resList.addAll(res);
 		
		return resList;
	}

	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = threeSum(arr);
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i).toString());
		}
	}
}
