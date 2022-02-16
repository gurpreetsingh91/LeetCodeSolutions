import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leetcode1832_SentencePanagram {

    public static boolean checkIfPangram(String sentence) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        map.put('d', 0);
        map.put('e', 0);
        map.put('f', 0);
        map.put('g', 0);
        map.put('h', 0);
        map.put('i', 0);
        map.put('j', 0);
        map.put('k', 0);
        map.put('l', 0);
        map.put('m', 0);
        map.put('n', 0);
        map.put('o', 0);
        map.put('p', 0);
        map.put('q', 0);
        map.put('r', 0);
        map.put('s', 0);
        map.put('t', 0);
        map.put('u', 0);
        map.put('v', 0);
        map.put('w', 0);
        map.put('x', 0);
        map.put('y', 0);
        map.put('z', 0);

        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.charAt(i), map.get(sentence.charAt(i)) + 1);
        }

        int val;
        // Getting an iterator
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry key = (Map.Entry) iterator.next();
            val = ((int) key.getValue());
            if (val == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean res = checkIfPangram(sentence);
    }
}
