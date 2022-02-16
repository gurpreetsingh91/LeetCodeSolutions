import java.util.Stack;

public class leetcode682_baseballGame {

    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();
        int tmp1,tmp2,sum=0;

        for(int i=0;i<ops.length;i++){

            if(ops[i].equals("+")){
                    tmp1 = stack.pop();
                    tmp2 = stack.pop();
                    stack.add(tmp2);
                    stack.add(tmp1);
                    stack.add(tmp1+tmp2);
            }
            else if(ops[i].equals("C")){
                    stack.pop();
            }
            else if(ops[i].equals("D")){
                    tmp1 = stack.peek();
                    stack.add(tmp1*2);
            }
            else{
                stack.add(Integer.parseInt(ops[i]));
            }

        }

        while(!stack.empty()){
            sum = sum + stack.pop();

        }
        //System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        String[] str = {"5","2","C","D","+"};
        leetcode682_baseballGame game = new leetcode682_baseballGame();
        System.out.println(game.calPoints(str));
    }
}
