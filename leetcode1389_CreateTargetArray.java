import java.util.ArrayList;
import java.util.List;

public class leetcode1389_CreateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++) {
            list.add(index[i],nums[i]);
        }

        int[] target = new int[list.size()];

        for(int i=0;i<list.size();i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
            int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
            leetcode1389_CreateTargetArray obj = new leetcode1389_CreateTargetArray();
            int[] res = obj.createTargetArray(nums,index);
    }
}
