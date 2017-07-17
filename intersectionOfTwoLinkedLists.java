package LeetCode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */

public class intersectionOfTwoLinkedLists {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0, lenB = 0 , diff;

		ListNode startA = headA;
		ListNode startB = headB ;
		
		while (headA != null) {
			// System.out.print(headA.val + " ");
			lenA++;
			headA = headA.next;
		}

		while (headB != null) {
			// System.out.print(headB.val + " ");
			lenB++;
			headB = headB.next;
		}

		if(lenA == 1 && lenB ==1 && startA.val == startB.val){
			return startA;
		}
	/*	if(lenA == 0 || lenA==1 || lenB == 0 || lenB==1)
			return null;*/
		
		diff = Math.abs(lenA-lenB) ;
		
		//balancing
		if(diff > 0){
			
			if(lenA > lenB){
				
				while(diff>0){
					startA = startA.next;
					diff--;
				}
			}
			else{
				
				while(diff>0){
					startB = startB.next;
					diff--;
				}
			}
		}
		
		//After balancing is done or case when balancing not required
		while(startA != null && startB != null){
			
			if(startA == startB){
				return startA;
			}
			startA = startA.next;
			startB = startB.next;
			
		}
		

		return null;
	}

	public static void main(String[] args) {

		ListNode firstA = new ListNode(1);
		ListNode secondA = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		firstA.next = secondA;
		firstA.next.next = third;
		firstA.next.next.next = fourth;
		firstA.next.next.next.next = fifth;
		firstA.next.next.next.next.next = sixth;

		ListNode firstB = new ListNode(7);
		ListNode secondB = new ListNode(8);
		ListNode thirdB = new ListNode(9);
		firstB.next = secondB;
		firstB.next.next = thirdB;
		firstB.next.next.next = third;

		ListNode res = getIntersectionNode(firstA, firstB);
		if(res == null)
			System.out.println("No Intersection");
		else
			System.out.println(res.val);
	}
}

/*
 * while(headA!=null){ System.out.print(headA.val + " "); headA = headA.next; }
 * System.out.println("\n");
 * 
 * while(headB!=null){ System.out.print(headB.val + " "); headB = headB.next; }
 */