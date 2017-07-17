package LeetCode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode list1 , list2 , listTemp1,listTemp2 , startNew , start;
		int len1=0 , len2=0 , carry=0;
		list1 =  l1 ; listTemp1 = l1;
		list2 =  l2 ; listTemp2 = l2;
		while(list1 != null){
			len1++;
			list1 = list1.next;
		}
		
		while(list2 != null){
			len2++;
			list2 = list2.next;
		}
		
		if(len1 == 0 && len2 == 0)
			return null;
		if(len1 == 0 && len2 != 0)
			return l2;
		if(len2 == 0 && len1 != 0)
			return l1;
		
		
		int sum = listTemp1.val + listTemp2.val;
		if(sum>=10){
			startNew = new ListNode(sum%10);
			carry = 1;
		}else{
			startNew = new ListNode(sum);
			carry = 0;
		}
		start = startNew;
		listTemp1 = listTemp1.next;
		listTemp2 = listTemp2.next;
		
		while(listTemp1 != null && listTemp2 != null){
			sum = listTemp1.val + listTemp2.val + carry;
			if(sum>=10){
				startNew.next = new ListNode(sum%10);
				carry = 1;
			}else{
				startNew.next = new ListNode(sum);
				carry = 0;
			}
			startNew = startNew.next;
			listTemp1 = listTemp1.next;
			listTemp2 = listTemp2.next;
		}
		
		//now 3 conditions
		if(len1 == len2){
			
			if(carry == 1){
				startNew.next = new ListNode(1);
				startNew = startNew.next;
			}
			return start;
		}
		else if(len1 > len2){
			
			while(listTemp1 != null ){
				sum = listTemp1.val + carry;
				if(sum>=10){
					startNew.next = new ListNode(sum%10);
					carry = 1;
				}else{
					startNew.next = new ListNode(sum);
					carry = 0;
				}
				startNew = startNew.next;
				listTemp1 = listTemp1.next;
			}
		}
		else if(len2 > len1){
			
			while(listTemp2 != null ){
				sum = listTemp2.val + carry;
				if(sum>=10){
					startNew.next = new ListNode(sum%10);
					carry = 1;
				}else{
					startNew.next = new ListNode(sum);
					carry = 0;
				}
				startNew = startNew.next;
				listTemp2 = listTemp2.next;
			}
			
		}
		
		if(carry == 1){
			startNew.next = new ListNode(1);
			startNew = startNew.next;
		}
		
		
		return start;
	}

	public static void main(String[] args) {

		//2 - 4  - 3 
		ListNode start1 = new ListNode(5);
		
      
		//5 - 6  - 4 - 7 -  8
		ListNode start2 = new ListNode(5);
		

		ListNode result = addTwoNumbers(start1, start2);
		
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}

	}
}
