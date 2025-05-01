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
    int Total; 
    private void dfs(TreeNode root, String s)
    {
        if(root==null)
        {
            return;
        }
        s=s+root.val;

        if(root.left==null && root.right==null)
        {
            
            Total+=Integer.valueOf(s);
        }

        dfs(root.left,s);
        dfs(root.right,s);

    }
    public int sumNumbers(TreeNode root) {
 
        String s="";
        Total=0;
        dfs(root,s);
        

        return Total;
    }
}