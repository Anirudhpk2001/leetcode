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
    private boolean solve(TreeNode root,int sum,int targetSum)
    {
        if(root == null)
        {
            return false;
        }
       if(root.left == null && root.right == null)
       {
            if(sum+root.val == targetSum)
            {
                return true;
            }
            else
            {
                return false;
            }
       }

        sum += root.val;

        return solve(root.left,sum,targetSum) || solve(root.right,sum,targetSum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
        {
            return false;
        }

        return solve(root,0,targetSum);
    }
}