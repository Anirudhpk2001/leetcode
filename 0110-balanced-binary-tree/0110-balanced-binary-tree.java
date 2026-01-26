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

    private int depth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        if(left == -1 || right == -1) return -1;

        if(Math.abs(right-left) >1) return -1;

        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true;
        }

        if(root.left == null && root.right == null)
        {
            return true;
        }
       
       if(depth(root) == -1)
       {
        return false;
       }

       return true;
    }
}