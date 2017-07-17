package LeetCode;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        
	        for(int i=0;i<nums.length-1;i++){
	        	for(int j=i+1;j<nums.length;j++){
	        		
	        		if(nums[i]+nums[j]==target){
	        			
	        			result[0]=i;
	        	        result[1]=j;
	        		}
	        	}
	        }
	        
		 
	 		return result;
	 }
	public static void main(String[] args){
		int[] nums = new int[4];
		nums[0] = 2;
		nums[1] = 7;
		nums[2] = 11;
		nums[3] = 15;
		int[] result = twoSum(nums,9);
		System.out.println(result[0] + " " + result[1]);
	}
}

