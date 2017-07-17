package LeetCode;

public class palindromeLinkedList {

	public static boolean isPalindrome(ListNode head) {
		
    }
	
	public static void main(String[] args) {
		
		ListNode first = new ListNode(1);
		first.next = new ListNode(2);
		first.next.next = new ListNode(3);
		first.next.next.next = new ListNode(4);
		first.next.next.next.next = new ListNode(5);
		first.next.next.next.next.next = new ListNode(6);
		boolean res = isPalindrome(first);
		System.out.println(res);
		
	}
}
