import java.util.HashMap;
import java.util.List;

public class leetcode645 {

    public int[] findErrorNums(int[] nums) {

        int duplicateNumber = 0 , maxNum = Integer.MIN_VALUE, missingNum = 0;

        //get the maximum number
        maxNum = nums.length;

        //get the duplicate number
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hMap.get(nums[i])== null)
                hMap.put(nums[i],1);
            else{
                duplicateNumber = nums[i];
            }
        }
        //find the missing number
        for(int j=1;j<=maxNum;j++){
            if(hMap.get(j) == null)
                missingNum = j;
        }

        int[] result = new int[2];
        result[0] = duplicateNumber;
        result[1] = missingNum;


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        leetcode645 obj = new leetcode645();
        int[] res = obj.findErrorNums(nums);
        System.out.println(res[0] + " " + res[1]);
    }
}
