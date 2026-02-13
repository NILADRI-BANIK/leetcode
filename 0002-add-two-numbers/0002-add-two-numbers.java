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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l1;
        } else if (l2 == null) {
            return l2;
        }

        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null || p2 != null) {
            int val1 = p1 != null ? p1.val : 0;
            int val2 = p2 != null ? p2.val : 0;
            int sum = val1 + val2 + carry;
            int d = sum % 10;
            carry = sum / 10;
            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            p1 = p1 != null ? p1.next : null;
            p2 = p2 != null ? p2.next : null;
        }
        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }
        return ans.next;
    }
}