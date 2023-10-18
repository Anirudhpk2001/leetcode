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
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        targetSum=targetSum-root.val;
        if(root.left==null && root.right==null && targetSum==0)
        {
            return true;
        }
      
       
        boolean left=hasPathSum(root.left, targetSum);
        boolean right=hasPathSum(root.right,targetSum);
        if(left==true || right == true)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}