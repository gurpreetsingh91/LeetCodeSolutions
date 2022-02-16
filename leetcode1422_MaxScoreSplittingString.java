public class leetcode1422_MaxScoreSplittingString {
    public int maxScore(String s) {

        int previousZeroCount=0, previousOneCount = 0, maxScore=0;
        int[] scoreZero = new int[s.length()];
        int[] scoreOne = new int[s.length()];
        int[] scoreTotal = new int[s.length()];

        //storing the count of zeroes from left side
        for (int i=0;i<s.length()-1;i++) {

            if(s.charAt(i) == '0') {
                scoreZero[i] = previousZeroCount + 1;
                previousZeroCount = scoreZero[i];
            }
            else {
                scoreZero[i] = previousZeroCount;
            }
        }

        //storing the count of one from right side
        for(int i=s.length()-1;i>0;i--) {

            if(s.charAt(i) == '1') {
                scoreOne[i] = previousOneCount+1;
                previousOneCount = scoreOne[i];
            }
            else {
                scoreOne[i] = previousOneCount;
            }
        }

        //calculating total score
        for(int i=0;i<s.length();i++) {
            scoreTotal[i] = scoreZero[i] + scoreOne[i];
            if(scoreTotal[i] > maxScore) {
                maxScore = scoreTotal[i];
            }
        }


        return maxScore;
    }

    public static void main(String[] args) {
        String str = "011101";
        leetcode1422_MaxScoreSplittingString obj = new leetcode1422_MaxScoreSplittingString();
        int res = obj.maxScore(str);
        System.out.println(res);


    }
}
