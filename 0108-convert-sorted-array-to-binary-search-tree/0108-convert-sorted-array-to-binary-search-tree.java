/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] n) {
        return helper(n, 0, n.length - 1);
    }

    public TreeNode helper(int n[], int s, int e) {
        if (s > e) {
            return null;
        }
        int m = (s + e) / 2;
        TreeNode root = new TreeNode(n[m]);
        root.left = helper(n, s, m - 1);
        root.right = helper(n, m + 1, e);
        return root;
    }
}