public class leetcode1550_threeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {

        int oddCount=0;
        for(int i=0;i<arr.length;i++) {

            if(arr[i]%2 != 0 ){
                oddCount++;
                if(oddCount==3)
                    return true;
            }
            else
                oddCount=0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        leetcode1550_threeConsecutiveOdds obj = new leetcode1550_threeConsecutiveOdds();
        boolean res = obj.threeConsecutiveOdds(arr);
    }
}
