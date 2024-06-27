package leetcode.easy.linkedList;

public class RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;

        ListNode current = head;

        while(head.next != null) {
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
