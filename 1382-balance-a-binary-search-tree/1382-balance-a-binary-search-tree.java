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
    public void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return BSTmake(list, 0, list.size() - 1);
    }

    public TreeNode BSTmake(ArrayList<Integer> list, int s, int e) {
        if (s > e) {
            return null;
        }
        int m = (s + e) / 2;
        TreeNode root = new TreeNode(list.get(m));
        root.left = BSTmake(list, s, m - 1);
        root.right = BSTmake(list, m + 1, e);
        return root;
    }
}
