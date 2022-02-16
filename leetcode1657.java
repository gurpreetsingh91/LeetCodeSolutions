import java.util.HashMap;

public class leetcode1657 {

    public static boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length())
            return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=-0;i < word1.length();i++){
            if(map1.get(word1.charAt(i)) == null)
                map1.put(word1.charAt(i), 1);
            else
                map1.put(word1.charAt(i), map1.get(word1.charAt(i))+1);
        }


        for(int i=-0;i < word2.length();i++){
            if(map2.get(word2.charAt(i)) == null)
                map2.put(word2.charAt(i), 1);
            else
                map2.put(word2.charAt(i), map2.get(word2.charAt(i))+1);
        }

        //Iterate through the hashmap




        return false;
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "bca";
        boolean result = closeStrings(word1,word2);
        System.out.println(result);
    }
}
