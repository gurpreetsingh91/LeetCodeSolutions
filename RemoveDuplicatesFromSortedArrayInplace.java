package LeetCode;

public class RemoveDuplicatesFromSortedArrayInplace {

	public static int removeDuplicates(int[] nums) {

		int len = nums.length, counter, temp, actLen = 0;
		if (len == 0)
			return 0;

		if (len == 1)
			return 1;

		temp = nums[0];
		counter = 1;
		actLen = 1;
		for (int i = 1; i < len; i++) {

			if (nums[i] != temp) {
				nums[counter] = nums[i];
				temp = nums[counter];
				counter++;
				actLen++;
				
			}

		}
		/*for (int j = 0; j < len; j++) {
			System.out.print(nums[j] + " ");
		}*/
		return actLen;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2 ,3};
		int res = removeDuplicates(arr);
		System.out.println(res);

	}
}
