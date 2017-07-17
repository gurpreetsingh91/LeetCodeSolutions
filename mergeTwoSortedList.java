package LeetCode;

class ListNode3 {
	int val;
	ListNode3 next;

	ListNode3(int x) {
		val = x;
		next = null;
	}
}


public class mergeTwoSortedList {

	public static ListNode3 mergeTwoLists(ListNode3 list1, ListNode3 list2) {
			
		if(list1 == null)
			return list2;
		
		if(list2 == null)
			return list1;
		
		ListNode3 start = null , temp = start ; 
		
		if(list1.val <= list2.val){
			start = new ListNode3(list1.val);
			list1 = list1.next;
			temp = start;
		}
		else{
			start = new ListNode3(list2.val);
			list2 = list2.next;
			temp = start; 
		}
		
		
		while(list1!= null && list2 != null){
			
			if(list1.val <= list2.val){
				start.next = new ListNode3(list1.val); 
				start = start.next;
				list1 = list1.next;
			}
			else{
				start.next = new ListNode3(list2.val); 
				start = start.next;
				list2 = list2.next;
			}
		}
		
		
		if(list1 == null){
			while(list2 != null){
				start.next = new ListNode3(list2.val); 
				start = start.next;
				list2 = list2.next;
			}
		}
		
		if(list2 == null){
			while(list1 != null){
				start.next = new ListNode3(list1.val); 
				start = start.next;
				list1 = list1.next;
			}
		}
		
		return temp;
    }
	public static void main(String[] args) {
		
		ListNode3 firstList = new ListNode3(1);
		firstList.next =  new ListNode3(5);
		firstList.next.next = new ListNode3(9);
		
		
		ListNode3 secList = new ListNode3(3);
		secList.next =  new ListNode3(6);
		secList.next.next = new ListNode3(8);
		
		ListNode3 res = mergeTwoLists(firstList,secList);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
		
	}
}
