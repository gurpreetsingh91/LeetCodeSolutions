import java.util.Stack;
import java.util.StringTokenizer;

public class leetcode227_BasicCalculator {

    int compute(int num1, int num2, char ch) {
        if(ch == '+')
            return num1 + num2;
        else if (ch == '-')
            return num1 - num2;
        else if(ch == '*')
            return num1*num2;
        else
            return num1/num2;
    }
    public int calculate(String s) {


        StringBuilder strToken = new StringBuilder();
        char ch,operator;
        int operand1, operand2,res=0;
        StringBuilder str = new StringBuilder();
        //StringTokenizer stringTokenizer = new StringTokenizer(s,"\\\\s+");
        String[] strArr = s.split("\\s+");
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        //if(strArr.length ==1 )
          //  return Integer.parseInt(strArr[0]);

        for(String st : strArr) {
            str.append(st);
        }

        //StringTokenizer stringTokenizer = new StringTokenizer(s,"+-*/");

        for(int i=0;i<str.length();i++) {

            ch = str.charAt(i);

            //character is operand
            if(ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                strToken.append(ch);
                //operands.push(ch);
            }
            //character is operator
            else {
                operands.push(strToken.toString());
                strToken.setLength(0);

                if(operators.isEmpty()) {
                    operators.add(ch);
                    continue;
                }

                if((ch == '*' || ch == '/')  && (operators.peek() == '/' || operators.peek() == '*')) {
                    operand1 = Integer.parseInt(operands.pop());
                    operand2 = Integer.parseInt(operands.pop());
                    operator = operators.pop();
                    res = compute(operand2,operand1,operator);
                    operands.push(Integer.toString(res));
                    operators.push(ch);
                }
                else if ((ch == '*' || ch == '/') && (operators.peek() == '+' || operators.peek() == '-')) {
                    operators.push(ch);
                }
                else if( (ch == '+' || ch == '-') && (operators.peek() == '+' || operators.peek() == '-')) {
                    operand1 = Integer.parseInt(operands.pop());
                    operand2 = Integer.parseInt(operands.pop());
                    operator = operators.pop();
                    res = compute(operand2,operand1,operator);
                    operands.push(Integer.toString(res));
                    operators.push(ch);
                }
                else if((ch == '+' || ch == '-') && (operators.peek() == '*' || operators.peek() == '/')) {
                    operand1 = Integer.parseInt(operands.pop());
                    operand2 = Integer.parseInt(operands.pop());
                    operator = operators.pop();
                    res = compute(operand2,operand1,operator);
                    operands.push(Integer.toString(res));
                    operators.push(ch);
                }
            }
        }

        operands.push(strToken.toString());

        if(operands.size() == 1)
            return Integer.parseInt(operands.pop());

        while(!operators.isEmpty()) {
            operand1 = Integer.parseInt(operands.pop());
            operand2 = Integer.parseInt(operands.pop());
            operator = operators.pop();
            res = compute(operand2,operand1,operator);
            operands.push(Integer.toString(res));
        }

        //System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String str = "2-3+4";
        leetcode227_BasicCalculator obj = new leetcode227_BasicCalculator();
        int res = obj.calculate(str);
        System.out.println(res);
    }
}
