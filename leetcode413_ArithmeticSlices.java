public class leetcode413_ArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] nums) {

        if(nums.length<=1){
            return 0;
        }
        int [] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = 0;
        int sum=0;
        for(int i=2;i<dp.length;i++){
            int value1 = nums[i] - nums[i-1];
            int value2 = nums[i-1] - nums[i-2];
            if(value1 == value2){
                dp[i] = dp[i-1] + 1;
                sum += dp[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int res = numberOfArithmeticSlices(arr);
        System.out.println(res);

    }
}
