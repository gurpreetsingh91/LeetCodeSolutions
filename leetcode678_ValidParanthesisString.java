import java.util.LinkedList;
import java.util.Queue;

public class leetcode678_ValidParanthesisString {

    public boolean checkValidString(String s) {

        Queue<Character> q = new LinkedList<>();
        char ch;

        for(int i=0;i<s.length();i++) {

            ch = s.charAt(i);

            if(ch == '(') {
                q.add(ch);
            }
            else if ( ch == ')') {
                if(q.peek() == '*' ||  q.peek() == '(')
                    q.poll();
                else
                    q.add(ch);
            }
           // else if ( ch == '*')

        }
        return false;
    }
    public static void main(String[] args) {

        String str = "()";
        leetcode678_ValidParanthesisString obj = new leetcode678_ValidParanthesisString();
        obj.checkValidString(str);

    }
}
