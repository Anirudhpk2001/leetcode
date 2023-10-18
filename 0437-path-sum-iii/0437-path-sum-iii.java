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
   
    public int path(TreeNode root, int targetSum)
    {   
        if(root==null||targetSum<-19999999)
        {
            return 0; 
        }
         int count=0;
        targetSum=targetSum-root.val;
        if(targetSum==0)
        {
            count++;
        }
        
        count+=path(root.left, targetSum);
        count+=path(root.right,targetSum);
        return count;

    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return 0;
        }
        int count=path(root,targetSum);
        int count1=pathSum(root.left,targetSum);
        int count2=pathSum(root.right,targetSum);
       
        return count+count1+count2;
    }
}