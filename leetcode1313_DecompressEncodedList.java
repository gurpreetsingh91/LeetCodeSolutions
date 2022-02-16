import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1313_DecompressEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int freq, val;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i = i + 2) {
            freq = nums[i];
            val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }

        int[] res = new int[list.size()];
        //copy the values from the list to array
        for(int i=0;i<res.length;i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        leetcode1313_DecompressEncodedList obj = new leetcode1313_DecompressEncodedList();
        int[] nums = {1, 1, 2, 3};
        int[] res = obj.decompressRLElist(nums);
        System.out.println(Arrays.toString(res));

    }
}
