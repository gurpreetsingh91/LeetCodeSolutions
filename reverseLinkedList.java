package LeetCode;

public class reverseLinkedList {

	public static ListNode reverseList(ListNode head) {

		ListNode p = head;
		int len = 0;
		while (p != null) {
			len++;
			p = p.next;
		}

		if (len == 0 || len == 1)
			return head;

		ListNode prev, curr, temp;
		prev = null;

		curr = head;

		while (curr.next != null) {

			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		curr.next = prev;

		return curr;
	}

	public static void main(String[] args) {

		ListNode first = new ListNode(1);
		//ListNode second = new ListNode(2);
		/*ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);*/
		//first.next = second;
		/*first.next.next = third;
		first.next.next.next = fourth;
		first.next.next.next.next = fifth;*/

		ListNode res = reverseList(null);

		while (res != null) {
			System.out.println(res.val + " ");
			res = res.next;
		}
	}

}
