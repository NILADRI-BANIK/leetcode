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
    public boolean hasPathSum(TreeNode root, int t) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == t) {
            return true;
        }
        boolean a1 = hasPathSum(root.left, t - root.val);
        boolean a2 = hasPathSum(root.right, t - root.val);
        return a1 || a2;
    }
}