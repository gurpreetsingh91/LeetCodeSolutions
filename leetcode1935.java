import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode1935 {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] strs = text.split(" ");
        Set<String> words = new HashSet<String>();
        List<String> listWords = new ArrayList<>();
        List<String> toBeRemovedWords = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            listWords.add(strs[i]);
        }

        for (int j = 0; j < listWords.size(); j++) {
            for (int m = 0; m < brokenLetters.length(); m++) {
                if (listWords.get(j).contains(String.valueOf(brokenLetters.charAt(m)))) {

                    toBeRemovedWords.add(listWords.get(j));
                    break;
                }
            }
        }

        for (int j = 0; j < toBeRemovedWords.size(); j++) {

            if (listWords.contains(toBeRemovedWords.get(j))) {
                listWords.remove(toBeRemovedWords.get(j));
            }
        }

        return listWords.size();
    }

    public static void main(String[] args) {
        //leetcode1935 leetcode1935 = new leetcode1935();
        //int size = leetcode1935.canBeTypedWords("leet code", "lt");
        //System.out.println(size);
        String str1 = "test1";
        String str2 = "test2";
        String str3 = String.format(str1, str2);
        System.out.println(str3);
    }
}
