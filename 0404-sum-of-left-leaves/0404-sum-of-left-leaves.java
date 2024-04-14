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
    
    public int traverse(TreeNode root,Boolean isLeft)
    {
        if(root==null)
        {
            return 0;
        }
        
        if(root.left==null && root.right==null && isLeft)
        {
            return root.val;
        }
        int sum=0;
        sum+=traverse(root.left,true);
        sum+=traverse(root.right,false);
        
        return sum;
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        
        if(root==null)
        {
            return 0;
        }

        return traverse(root,false);


    }
}