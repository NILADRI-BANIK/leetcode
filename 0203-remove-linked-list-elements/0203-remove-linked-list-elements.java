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
    public ListNode removeElements(ListNode h, int val) {
        if (h == null) {
            return null;
        }
        ListNode d = new ListNode(-1);
        d.next = h;
        ListNode c = d;
        while (c.next != null) {
            if (c.next.val == val) {
                c.next = c.next.next;
            } else {
                c = c.next;
            }
        }
        return d.next;
    }
}