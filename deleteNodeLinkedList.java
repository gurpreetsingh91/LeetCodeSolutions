package LeetCode;

public class deleteNodeLinkedList {

	public static void deleteNode(ListNode node) {
		ListNode temp1 ;
		temp1 = node.next;
		node.val = temp1.val;
		node.next = temp1.next;
		
		
	}

	public static void main(String[] args) {

		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		first.next = second;
		first.next.next = third;
		first.next.next.next = fourth;
		first.next.next.next.next = fifth;
		ListNode temp = third;
		deleteNode(temp);
		while(first != null){
			System.out.println(first.val + " ");
			first = first.next;
		}
	}
}
