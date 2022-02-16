import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class leetcode917_ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {

        Stack<Character> q = new Stack<>();
        char ch;
        int asciiVal;
        StringBuilder sb = new StringBuilder(S);

        //Getting all the letters
        for(int i=0;i<S.length();i++) {
            ch = S.charAt(i);
            asciiVal = (int)ch;
            if ( (asciiVal >= 97 && asciiVal <=122) || (asciiVal >= 65 && asciiVal <= 90)) {
                q.add(ch);
            }
        }

        //replacing all the letters in the reverse order
        for(int i=0;i<S.length();i++) {
            ch = S.charAt(i);
            asciiVal = (int)ch;
            if ( (asciiVal >= 97 && asciiVal <=122) || (asciiVal >= 65 && asciiVal <= 90)) {
                sb.setCharAt(i,q.pop());
            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Test1ng-Leet=code-Q!";
        leetcode917_ReverseOnlyLetters obj = new leetcode917_ReverseOnlyLetters();
        String res = obj.reverseOnlyLetters(str);
        System.out.println(res);
    }
}
