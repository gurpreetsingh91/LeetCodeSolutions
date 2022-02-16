import java.util.LinkedList;
import java.util.Queue;

public class leetcode345_reverseVowelsOfString {

    public String reverseVowels(String s) {

        char ch;
        Queue<Character> queue = new LinkedList<>();
        for(int i=0;i<s.length();i++) {
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                queue.add(ch);
            }
        }

        for(int i=s.length()-1; i >=0; i--){
            ch = s.charAt(i);
            StringBuilder sb = new StringBuilder(s);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.setCharAt(i,queue.poll());
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "aA";
        leetcode345_reverseVowelsOfString obj = new leetcode345_reverseVowelsOfString();
        String res = obj.reverseVowels(str);
        System.out.println(res);
    }
}
