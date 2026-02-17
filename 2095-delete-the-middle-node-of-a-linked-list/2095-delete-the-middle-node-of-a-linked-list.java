/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode h) {
        if (h.next == null) {
            return null;
        }
        ListNode f = h;
        ListNode s = h;
        ListNode p = s;
        while (f != null && f.next != null) {
            p = s;
            s = s.next;
            f = f.next.next;
        }
        p.next = p.next.next;
        return h;
    }
}