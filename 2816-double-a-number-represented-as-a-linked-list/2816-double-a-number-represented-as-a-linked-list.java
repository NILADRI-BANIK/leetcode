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
    public ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        
        return pre;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode nhead = reverse(head);
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        int carry = 0;

        while (nhead != null) {
            int sum = nhead.val + nhead.val + carry;
            int d = sum % 10;
            carry = sum / 10;
            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            nhead = nhead.next;
        }

        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return reverse(ans.next);
    }
}