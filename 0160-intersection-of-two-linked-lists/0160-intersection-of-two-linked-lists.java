/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int sizeL(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int s1 = sizeL(headA);
        int s2 = sizeL(headB);
        int d = s1 - s2;
        ListNode p1 = headA;
        ListNode p2 = headB;

        if (d > 0) { //headA is big size
            while (d > 0) {
                p1 = p1.next;
                d--;
            }
        } else {
            while (d < 0) { //headB is big size
                p2 = p2.next;
                d++;
            }
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}