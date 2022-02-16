package assessment.microsoft;

public class question1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int count1=0, count2=0, count3=0;
        int[] nums3 = new int[m+n];

        while (m>0 && n>0) {
            if (nums1[count1] <= nums2[count2]) {
                nums3[count3] = nums1[count1];
                count1++;
                count3++;
                m--;
            }
            else {
                nums3[count3] = nums2[count2];
                count2++;
                count3++;
                n--;
            }
        }

        while (m > 0) {
            nums3[count3] = nums1[count1];
            count1++;
            count3++;
            m--;
        }

        while (n > 0) {
            nums3[count3] = nums2[count2];
            count2++;
            count3++;
            n--;
        }

        for (int i =0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }

    }

    public static void main(String[] args) {

        int[] nums1 = {0};
        int[] nums2 = {1};
        question1 obj = new question1();
        obj.merge(nums1, 0, nums2, 1);

    }
}
