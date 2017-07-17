package LeetCode;

public class removeNthNodeFromEndOfList {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head, temp1 = head;
		int len = 0, nodeindex;

		while (head != null) {
			len++;
			head = head.next;
		}

		// corner cases
		if (len == 0 || len == 1)
			return head;

		if (len == 2) {
			if (n == 1) {
				temp.next = null;
				return temp;
			} else if (n == 2) {
				temp = temp.next;
				return temp;
			}
		}

		nodeindex = len - n - 1;

		if (nodeindex == -1) {
			temp = temp.next;
			return temp;
		}
		while (nodeindex-- != 0) {

			temp = temp.next;

		}

		if (temp.next != null)
			temp.next = temp.next.next;
		else
			temp = null;

		return temp1;
	}

	public static void main(String[] args) {

		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(3);
		/*
		 * first.next.next.next = new ListNode(4); first.next.next.next.next =
		 * new ListNode(5);
		 */
		ListNode res = removeNthFromEnd(first, 1);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
