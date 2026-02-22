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
    public TreeNode searchBST(TreeNode root, int t) {
        TreeNode temp = root;
        while (temp != null) {
            if (t == temp.val) {
                break;
            } else if (t < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }
}