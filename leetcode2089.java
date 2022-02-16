import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int[] sortedNums = Arrays.stream(nums).toArray();

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (sortedNums[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 5;
        leetcode2089 obj = new leetcode2089();
        List<Integer> integers = obj.targetIndices(nums, target);

        for (int i = 0; i < integers.size(); i++)
            System.out.println(integers.get(i));
    }
}
