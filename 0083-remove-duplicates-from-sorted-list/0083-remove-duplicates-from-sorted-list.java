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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(head.val);
        ListNode a = dummy;
        ListNode p = head.next;

        while (p != null) {
            if (p.val != dummy.val) {
                dummy.next = p;
                dummy = dummy.next;
            }
            p = p.next;
        }
        dummy.next = null;
        return a;
    }
}