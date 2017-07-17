package LeetCode;

public class sortColors {

	public static void sortColors(int[] nums) {

		int len = nums.length, red = 0, white = 0, blue = 0,start;
		for (int i = 0; i < len; i++) {

			if(nums[i]==0)
				red++;
			else if(nums[i]==1)
				white++;
			else if(nums[i]==2)
				blue++;
		}
		start = 0;
		for(int j=0;j<red;j++)
			nums[start++] = 0;
		
		for(int k=0;k<white;k++)
			nums[start++] = 1;
		
		for(int m=0;m<blue;m++)
			nums[start++] = 2;
		

		/*for(int w=0;w<len;w++)
			System.out.print(nums[w] + " ");*/
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 0, 0, 0, 1, 2, 0, 1, 2 };
		sortColors(arr);
	}
	
	

}
