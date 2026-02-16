/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode h) {
        if (h == null || h.next == null) {
            return null;
        }
        ListNode f = h;
        ListNode s = h;
        ListNode p = h;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                while (p != s) {
                    p = p.next;
                    s = s.next;
                }
                return p;
            }
        }
        return null;
    }
}