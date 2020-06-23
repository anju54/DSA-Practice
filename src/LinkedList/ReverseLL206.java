package LinkedList;

public class ReverseLL206 {

    ListNode head;

    class ListNode {
        int data ;
        ListNode next;

        ListNode(int d){
            data = d;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }
}
