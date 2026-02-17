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
    public ListNode mergeNodes(ListNode h) {
        ListNode d = new ListNode(-1);
        ListNode c = h.next;
        ListNode a = d;
        int sum = 0;
        while (c != null) {
            if (c.val != 0) {
                sum = sum + c.val;
            } else {
                ListNode temp = new ListNode(sum);
                d.next = temp;
                d = d.next;
                sum = 0;
            }
            c = c.next;
        }
        return a.next;
    }
}