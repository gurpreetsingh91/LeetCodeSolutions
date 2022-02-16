public class leetcode1672_RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maxSum =0, sum=0;
        for(int i=0;i<accounts.length;i++) {
            for(int j=0;j<accounts[i].length;j++) {
                sum+= accounts[i][j];
            }
            if(sum > maxSum)
                maxSum = sum;

            sum =0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        leetcode1672_RichestCustomerWealth obj = new leetcode1672_RichestCustomerWealth();
        int maxWealth = obj.maximumWealth(accounts);
        System.out.println(maxWealth);
    }
}
