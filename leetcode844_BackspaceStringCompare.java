import java.util.Stack;

public class leetcode844_BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {

        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();
        Stack<String> stackS = new Stack<>();
        Stack<String> stackT = new Stack<>();
        String newS, newT;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '#' && !stackS.isEmpty()){
                stackS.pop();
            }
            else if(S.charAt(i) == '#' && stackS.isEmpty()){

            }
            else
                stackS.push(Character.toString(S.charAt(i)));
        }

        for(int i=0;i<T.length();i++){
            if(T.charAt(i) == '#' && !stackT.isEmpty()){
                stackT.pop();
            }
            else if(T.charAt(i) == '#' && stackT.isEmpty()){

            }
            else
                stackT.push(Character.toString(T.charAt(i)));
        }

        while(!stackS.isEmpty()){
            sbS.append(stackS.pop());
        }
        sbS.reverse();
        newS = sbS.toString();
        //System.out.println(newS);

        while(!stackT.isEmpty()){
            sbT.append(stackT.pop());
        }
        sbT.reverse();
        newT = sbT.toString();
        //System.out.println(newT);

        return newS.equals(newT);

    }

    public static void main(String[] args) {
        leetcode844_BackspaceStringCompare obj = new leetcode844_BackspaceStringCompare();
        String S = "y#fo##f", T = "y#f#o##f";
        boolean res = obj.backspaceCompare(S,T);
        System.out.println(res);

    }

}
