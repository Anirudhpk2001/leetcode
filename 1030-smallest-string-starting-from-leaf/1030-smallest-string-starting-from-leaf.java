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
    String result = null;

    private void dfs(TreeNode root, StringBuilder curr) {
        if (root == null) return;

        curr.insert(0, (char)(root.val + 'a'));

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            String candidate = curr.toString();
            if (result == null || candidate.compareTo(result) < 0) {
                result = candidate;
            }
        }

        dfs(root.left, curr);
        dfs(root.right, curr);

        curr.deleteCharAt(0); // backtrack
    }

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return result;
    }
}