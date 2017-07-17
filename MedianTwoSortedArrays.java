package LeetCode;

public class MedianTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int ttlLenth = nums1.length + nums2.length;
		//System.out.println(ttlLenth);
		int i, j;
		int count = 0, mid = ttlLenth / 2;
		i = 0;
		j = 0;
		if (ttlLenth % 2 == 0) {

			while (count != mid-1 && i < nums1.length && j < nums2.length)  {
				if (nums1[i] <= nums2[j]) {
					count = count + i++;
				} else
					count = count + j++;
			}
			
			if(count == mid-1){
				
				System.out.println("Median : " + (double)(nums1[i] + nums2[j]) / 2);
				return (double)(nums1[i] + nums2[j]) / 2;
			}
			else{
				 
			}

			
			// System.out.println("Median : " + nums1[]);
		} else {
			
			while (i + j != mid && i < nums1.length && j < nums2.length) {
				if (nums1[i] <= nums2[j]) {
					i++;
				} else
					j++;
			}
			if (nums1[i] <= nums2[j]){
				//System.out.println("Median : " + nums1[i]);
				return (double)nums1[i];
			}
			else{
				//System.out.println("Median : " + nums2[j]);
				return (double)nums2[j];
			}
				

		}
	}

	public static void main(String[] args) {

		int[] num1 = { 2,3,4,5,6,6,7 };
		int[] num2 = { 1};

		findMedianSortedArrays(num1, num2);

	}

}

/*if(ttlLenth == 1){
	if(nums1.length == 1)
		return (double)(nums1[0]/2);
	else
		return (double)(nums2[0]/2);
}*/
