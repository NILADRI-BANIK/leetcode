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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode p = head;
        while (p != null) {
            st.push(p.val);
            p = p.next;
        }

        ListNode p1 = head;
        while (p1 != null) {
            int v1 = p1.val;
            int v2 = st.pop();
            if (v1 != v2) {
                return false;
            }
            p1 = p1.next;
        }
        return true;
    }
}