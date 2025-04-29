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
    int maxsum=0;

    private void dfs(TreeNode root, int min, int max)
    {
        if(root==null)
        {
            return ;
        }
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        maxsum=Math.max(maxsum,Math.abs(root.val-min));
        maxsum=Math.max(maxsum,Math.abs(root.val-max));

        dfs(root.left,min,max);
        dfs(root.right,min,max);

        return;

    }
    public int maxAncestorDiff(TreeNode root) {
        int min=Integer.MAX_VALUE;;
        int max=0;

        dfs( root,min,max);

        return maxsum;
    }
}