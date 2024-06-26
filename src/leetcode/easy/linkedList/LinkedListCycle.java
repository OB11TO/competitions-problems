package leetcode.easy.linkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedListCycle {

    public static void main(String[] args) {
        System.out.println(hasCycle(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2))))));
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;

        }
        return false;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode first = head;
        while (head != null) {
            if (first.next != null && first.next.next != null) {
                first = first.next.next;
                if (head == first) {
                    return true;
                }
                head = head.next;
            } else {
                return false;
            }
        }
        return false;
    }


    /*
    РАБОТАТ, ЕЛСИ В head все элементы уникальные
     */
    public static boolean hasCycle2(ListNode head) {
        if (head.next == null) {
            return false;
        }

        Map<Integer, Boolean> map = new HashMap<>();
        while (head != null) {
            if (map.containsKey(head.val)) {
                if (map.get(head.val)) {
                    return true;
                }

            } else {
                map.put(head.val, true);
                head = head.next;
            }
        }

        return true;
    }
}
