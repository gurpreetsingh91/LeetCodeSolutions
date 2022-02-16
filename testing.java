import java.util.ArrayList;
import java.util.List;

public class testing {

    public String firstPalindrome(String[] words) {

        String word = "";
        int start, end;
        for (int i=0; i< words.length; i++) {
            word = words[i];
            for (int j=0; j< word.length()/2; j++) {
                start = j;
                end = word.length()-1;
                if(word.charAt(start) == word.charAt(end)) {
                    start++;
                    end--;

                    if (end<=start)
                        return word;
                }
            }

        }
        return "";
    }

    public static void main(String[] args) {
        testing testing = new testing();
        String[] words = {"notapalindrome", "racecar"};
        System.out.println(testing.firstPalindrome(words));
    }
}
