package LeetCode;

public class swapNodesInPairs {

	public static ListNode swapPairs(ListNode head) {
		
		ListNode temp ;
		int counter = 0 , tempVal;
		if(head == null)
			return null;
		
		temp = head;
		
		while(head != null && head.next != null){
			tempVal = head.val;
			head.val = head.next.val;
			head.next.val = tempVal;
			head = head.next.next;
		}
		
		return temp;
	}

	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(3);
		first.next.next.next = new ListNode(4);
		first.next.next.next.next = new ListNode(5);
		first.next.next.next.next.next = new ListNode(6);
		
		ListNode res = swapPairs(first);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
		
	}
}
