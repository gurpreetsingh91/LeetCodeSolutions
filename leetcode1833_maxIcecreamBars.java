import java.util.Arrays;

public class leetcode1833_maxIcecreamBars {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int numIcecreamBars = 0;

        for(int i=0;i< costs.length; i++) {
            if(costs[i] <= coins) {
                numIcecreamBars++;
                coins = coins - costs[i];

            }
        }
        return numIcecreamBars;
    }
    
    public static void main(String[] args) {
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;
        leetcode1833_maxIcecreamBars obj = new leetcode1833_maxIcecreamBars();
        int res = obj.maxIceCream(costs, coins);
        System.out.println(res);

    }
}
