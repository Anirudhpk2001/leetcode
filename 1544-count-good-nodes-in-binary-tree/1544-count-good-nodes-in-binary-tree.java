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
    public int check(TreeNode root,int count,int max)
    {   if(root==null  )
        {
            return count;
        }
        if(root.val>=max )
        {
            max = root.val;
            count++;
        }
        int count1=check(root.left,0,max);
        
        int count2=check(root.right,0,max);
        return count+count1+count2;
    }
    public int goodNodes(TreeNode root) {
        return check(root,0,root.val);
    }
}