package leetcode.easy.linkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

//    ListNode(int val) {
//        this.val = val;
//    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}