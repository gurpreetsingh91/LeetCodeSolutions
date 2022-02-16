import java.util.Stack;

public class leetcode67_addBinary {

    public String addBinary(String a, String b) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> res = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char char1,char2,carry='0';

        for(int i=0; i< a.length(); i++){
            stack1.add(a.charAt(i));
        }

        for(int i=0; i< b.length(); i++){
            stack2.add(b.charAt(i));
        }

        while(!stack1.isEmpty() && !stack2.isEmpty()){
            char1 = stack1.pop();
            char2 = stack2.pop();
            if(char1 == '1' && char2 == '1'){
                if(carry == '1'){
                    res.add('1');
                    carry = '1';
                }else{
                    res.add('0');
                    carry = '1';
                }

            }
            else if((char1=='1' &&  char2 =='0') || (char1=='0' &&  char2 =='1')) {
                if(carry == '1') {
                    res.add('0');
                    carry = '1';
                } else {
                    res.add('1');
                    carry = '0';
                }
            }
            else{
                if(carry == '1'){
                    res.add('1');
                    carry = '0';
                }
                else {
                    res.add('0');
                    carry = '0';
                }


            }
        }

        while(!stack1.isEmpty()) {
            char1 = stack1.pop();

            if(char1 == '1' && carry == '1'){
                res.add('0');
                carry = '1';
            }
            else if((char1=='1' &&  carry =='0') || (char1=='0' &&  carry =='1')) {
                res.add('1');
                carry = '0';
            }
            else{
                if(carry == '1'){
                    res.add('1');
                    carry = '0';
                }else{
                    res.add('0');
                    carry = '0';
                }

            }
        }

        while(!stack2.isEmpty()) {
            char2 = stack2.pop();

            if(char2 == '1' && carry == '1'){
                res.add('0');
                carry = '1';
            }
            else if((char2=='1' &&  carry =='0') || (char2=='0' &&  carry =='1')) {
                res.add('1');
                carry = '0';
            }
            else{
                if(carry == '1'){
                    res.add('1');
                    carry = '0';
                }else{
                    res.add('0');
                    carry = '0';
                }
            }
        }

        if(carry == '1')
            res.add('1');

        while(!res.isEmpty()){
            sb.append(res.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "0", b = "0";

        leetcode67_addBinary obj = new leetcode67_addBinary();
        String res = obj.addBinary(a,b);
        System.out.println(res);
    }
}
