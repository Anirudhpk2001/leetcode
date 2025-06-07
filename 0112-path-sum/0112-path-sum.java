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
    private boolean solve(TreeNode root,int targetSum,int sum)
    {
        if(root==null)
        {
            return false;
        }
        sum+=root.val;
        if(root.left == null && root.right == null)
        {
            return sum == targetSum;
        }
        return solve(root.left,targetSum,sum) || solve(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null ) return false;
        return solve(root,targetSum,0);
    }
}