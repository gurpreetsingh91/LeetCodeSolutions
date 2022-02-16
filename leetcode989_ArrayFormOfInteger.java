import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode989_ArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] A, int K) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> res = new Stack<>();
        List<Integer> finalList = new ArrayList<>();
        int carry=0, sum=0;

        for(int num : A){
            stack1.add(num);
        }

        while(K != 0){
            temp.add(K%10);
            K = K/10;
        }

        while(!temp.isEmpty()){
            stack2.add(temp.pop());
        }

        while(!stack1.isEmpty() && !stack2.isEmpty()){
            sum = stack1.pop() + stack2.pop();
            if(carry >0)
                sum = sum + carry;
            res.add(sum%10);
            if(sum /10 > 0)
                carry = 1;
            else
                carry = 0;
        }

        while(!stack1.isEmpty()){
            sum = stack1.pop();
            if(carry > 0)
                sum = sum + carry;
            res.add(sum%10);
            if(sum /10 > 0)
                carry = 1;
            else
                carry = 0;
        }

        while(!stack2.isEmpty()){
            sum = stack2.pop();
            if(carry > 0)
                sum = sum + carry;
            res.add(sum%10);
            if(sum /10 > 0)
                carry = 1;
            else
                carry = 0;
        }

        if(carry > 0)
            res.add(carry);

        while(!res.isEmpty()){
            finalList.add(res.pop());
        }

        return finalList;
    }

    public static void main(String[] args) {
        leetcode989_ArrayFormOfInteger obj = new leetcode989_ArrayFormOfInteger();
        int A[] = {2,1,5};
        int K = 806;
        List<Integer> res = obj.addToArrayForm(A,K);
        System.out.println(res.toString());
    }
}
