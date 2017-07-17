package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class productOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		Set<Integer> hSet = new HashSet<Integer>();
		
		int len = nums.length,prod=1;
		int[] tmp = new int[len];
		
		for(int i=0;i<len;i++){
			
			if(nums[i]==0){
				hSet.add(i);
			}
			else
				prod =  prod * nums[i];

				
		}
		
		for(int j=0;j<len;j++){
			if(hSet.size() > 1){
				tmp[j] = 0;
			}
			else if(hSet.size()==1 && !hSet.contains(j)){
				tmp[j] = 0;
			}
			else if(nums[j] == 0){
				tmp[j] = prod;
			}
			else
				tmp[j] = prod/nums[j];
		}
		return tmp;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 0 };
		int[] res = productExceptSelf(arr);
		int len = res.length;
		for (int k = 0; k < len; k++) {
			System.out.print(res[k] + " ");
		}

	}
}
