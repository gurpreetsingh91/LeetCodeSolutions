import java.util.Stack;

public class leetcode445_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> result = new Stack<>();
        int num1,num2,sum=0, carry=0;
        while(l1 != null){
            stack1.add(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            stack2.add(l2.val);
            l2 = l2.next;
        }



        while(!stack1.isEmpty() && !stack2.isEmpty()){
            sum = carry + stack1.pop() + stack2.pop();
            if(sum /10 > 0)
                carry = 1;
            else
                carry = 0;
            //finalList.next = new ListNode(sum%10);
            //finalList = finalList.next;
            result.add(sum%10);
        }

        while(!stack1.isEmpty()){
            sum = carry + stack1.pop();
            if(sum /10 > 0)
                carry = 1;
            else
                carry = 0;
            //finalList.next = new ListNode(sum %10 );
            //finalList = finalList.next;
            result.add(sum%10);
        }

        while(!stack2.isEmpty()){
            sum = carry + stack2.pop();
            if(sum /10 > 0)
                carry = 1;
            else
                carry = 0;
            //finalList.next = new ListNode(sum %10 );
            //finalList = finalList.next;
            result.add(sum%10);
        }

        if(carry == 1)
            result.add(1);

        ListNode finalList = new ListNode(result.pop());
        ListNode finalListCopy = finalList;

        while(!result.isEmpty()){
            finalList.next = new ListNode(result.pop());
            finalList = finalList.next;
        }


        return finalListCopy;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(5);
        /*list1.next = new ListNode(9);
        list1.next.next = new ListNode(9);
        list1.next.next.next = new ListNode(9);*/

        ListNode list2 = new ListNode(5);
        /*list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);*/
        leetcode445_AddTwoNumbers obj = new leetcode445_AddTwoNumbers();
        ListNode res = obj.addTwoNumbers(list1,list2);

    }
}
