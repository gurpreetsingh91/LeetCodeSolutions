package LeetCode;

import java.util.Arrays;

public class shortestUnsortedContinuousSubarray {

	public static int findUnsortedSubarray(int[] nums) {
        
		int len = nums.length,start=0,end=0,flag=0,size =0;
		int arr[] = new int[len];
		for(int i=0;i<len;i++){
			arr[i] = nums[i];
		}
		Arrays.sort(arr);
		
		for(int j=0;j<len;j++){
			
			if(flag == 0 && nums[j] != arr[j]){
				start = j;
				flag = 1;
				size = end-start+1;
			}
			else if(flag ==1 && nums[j] != arr[j]){
				end = j;
				size = end-start+1;
			}
		}
		return size;
    }
	public static void main(String[] args) {
		int[] arr = {2, 6, 4, 8, 10, 9, 15};
		int res = findUnsortedSubarray(arr);
		System.out.println(res);
		
	}
}
