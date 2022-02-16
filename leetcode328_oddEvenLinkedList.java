public class leetcode328_oddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {


        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);
        node1.next.next.next.next = null;
        leetcode328_oddEvenLinkedList obj = new leetcode328_oddEvenLinkedList();
        ListNode res = obj.oddEvenList(node1);
        //obj.oddEvenList();

    }
}
