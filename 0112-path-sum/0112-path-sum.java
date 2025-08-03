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

    private boolean sum(TreeNode root, int targetSum, int Sum)
    {
        if(root == null)
        {
            return false;
        }
        if(root.left == null && root.right == null)
        {
            return Sum+root.val == targetSum;
        }
        

        if(sum(root.left,targetSum,Sum+root.val)==true || sum(root.right,targetSum,Sum+root.val) == true)  
        {
            return true;
        }

        return false;


    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //DFS 
        //my base if node is null i will return value of the leaf 
        
       
        return sum(root,targetSum,0);

        
    }
}