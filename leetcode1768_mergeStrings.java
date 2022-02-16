public class leetcode1768_mergeStrings {

    public String mergeAlternately(String word1, String word2) {

        int word1Len = word1.length(), word2Len = word2.length(), count1=0, count2=0;
        StringBuilder sb = new StringBuilder();

        while(word1Len>0 && word2Len>0) {
            sb.append(word1.charAt(count1++));
            sb.append(word2.charAt(count2++));
            word1Len--;
            word2Len--;
        }

        while(word1Len > 0) {
            sb.append(word1.charAt(count1++));
            word1Len--;
        }

        while (word2Len > 0) {
            sb.append(word2.charAt(count2++));
            word2Len--;
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        leetcode1768_mergeStrings obj = new leetcode1768_mergeStrings();
        String word1 = "abc", word2 = "pqr";
        String res = obj.mergeAlternately(word1,word2);
        System.out.println(res);
    }
}
