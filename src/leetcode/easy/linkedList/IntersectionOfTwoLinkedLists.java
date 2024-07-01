package leetcode.easy.linkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode preA = headA;
        ListNode preB = headB;

        while(preA != preB) {
            preA = (preA != null) ? preA.next : headB;
            preB = (preB != null) ? preB.next : headA;
        }
        return preA;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        LinkedHashMap<ListNode, Integer> map = new LinkedHashMap<>();
        while(headA != null) {
            map.put(headA, 1);
            headA = headA.next;
        }
        while(headB != null) {
            if(map.containsKey(headB)) {
                map.put(headB, 2);
            }
            headB = headB.next;
        }
        for(Map.Entry<ListNode,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 2) {
                return entry.getKey();
            }
        }
        return null;
    }

}
