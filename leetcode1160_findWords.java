import java.util.ArrayList;
import java.util.List;

public class leetcode1160_findWords {

    public static int countCharacters(String[] words, String chars) {

        boolean goodString = true;
        int sumGoodStrings = 0;
        List<Character> list = new ArrayList<>();

        for (String word : words) {
            goodString = true;
            list.clear();
            for (int k = 0; k < chars.length(); k++) {
                list.add(chars.charAt(k));
            }

            for (int i = 0; i < word.length(); i++) {

                if (list.contains(word.charAt(i))) {
                    list.remove((Character) word.charAt(i));
                } else {
                    goodString = false;
                }

            }
            if (goodString)
                sumGoodStrings = sumGoodStrings + word.length();

        }

        return sumGoodStrings;
    }

    public static void main(String[] args) {
        String[] str = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        int num = countCharacters(str, chars);
        System.out.println(num);
    }
}
