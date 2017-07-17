package LeetCode;

public class removeLinkedListElements {

	public static ListNode removeElements(ListNode head, int val) {

		int len = 0;

		ListNode temp = head;
		while (temp != null) {
			len++;
			temp = temp.next;
		}

		ListNode curr = head;
		ListNode prev = head, start = head;

		// Corner Cases
		if (len == 0)
			return head;

		while (curr != null) {

			if (curr.val == val) {
				prev.next = curr.next;
				curr = curr.next;
			} else {
				prev = curr;
				curr = curr.next;
			}

		}

		// now handle the weird case
		if (start.val == val)
			start = start.next;

		return start;
	}

	public static void main(String[] args) {

		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		/*
		 * ListNode third = new ListNode(3); ListNode fourth = new ListNode(4);
		 * ListNode fifth = new ListNode(5); ListNode sixth = new ListNode(3);
		 * ListNode seventh = new ListNode(7);
		 */
		first.next = second;
		first.next.next = third;
		/*
		 * first.next.next = third; first.next.next.next = fourth;
		 * first.next.next.next.next = fifth; first.next.next.next.next.next =
		 * sixth; first.next.next.next.next.next.next = seventh;
		 */
		ListNode res = removeElements(first, 3);

		while (res != null) {
			System.out.println(res.val + " ");
			res = res.next;
		}
	}
}
