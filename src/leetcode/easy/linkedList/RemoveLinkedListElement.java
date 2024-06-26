package leetcode.easy.linkedList;

public class RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;

        ListNode result = new ListNode();
        ListNode current = head;

        while(head != null && head.next != null) {
            if(head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        if(current.val == val) return current.next;
        return current;
    }
}
