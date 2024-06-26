package leetcode.easy.linkedList;


/*

[1,1,2,3,3]

[1,1,2,3,3] - list1
[1,2,3,3] - list2
[1,1,2,3,3] - current

[1,1,2,3,3] - tmp
[1,1,2,3,3] - result

[2,3,3] - tmp
[1,2,3,3] - result


 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(3)))))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return current;
    }
}
