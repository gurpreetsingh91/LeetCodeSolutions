public class leetcode1688_CountMatchesTournament {

    public int numberOfMatches(int n) {

        int matches = 0;
        while (n>1){

            //even
            if(n%2 == 0) {
                matches+= n/2;
                n = n/2;
            }
            else {
                matches+= (n-1)/2;
                n = (n-1)/2 + 1;
            }

        }
        return matches;
    }

    public static void main(String[] args) {
        leetcode1688_CountMatchesTournament obj = new leetcode1688_CountMatchesTournament();
        int res = obj.numberOfMatches(14);
        System.out.println(res);

    }
}
