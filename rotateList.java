package LeetCode;

/*class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}*/

public class rotateList {

	public static ListNode rotateRight(ListNode head, int k) {

		// corner case
		if (k == 0)
			return head;

		int len = 0, cutLen;
		ListNode first = head;
		ListNode prev = head;
		ListNode headTemp = head, headTemp2;

		while (head != null) {
			len++;
			head = head.next;
		}

		// Another corner case
		if (len == 0 || len == 1 || len == k || k % len == 0)
			return headTemp;

		if (k > len)
			k = k % len;
		cutLen = len - k;

		while (cutLen-- > 0) {
			prev = headTemp;
			headTemp = headTemp.next;
		}

		// first part points to NULL
		prev.next = null;

		headTemp2 = headTemp;
		// now traverse the second part
		while (headTemp.next != null) {
			headTemp = headTemp.next;
		}

		headTemp.next = first;

		return headTemp2;

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
		/*
		 * ListNode second = new ListNode(2); ListNode third = new ListNode(3);
		 * ListNode fourth = new ListNode(4); ListNode fifth = new ListNode(5);
		 * first.next = second; first.next.next = third; first.next.next.next =
		 * fourth; first.next.next.next.next = fifth;
		 */
		ListNode res = rotateRight(first, 10);

		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
