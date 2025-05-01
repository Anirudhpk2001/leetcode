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

    private void dfs(TreeNode root, ArrayList<String> res,String s)
    {
        if(root==null)
        {
            return;
        }
        s=s+root.val;

        if(root.left==null && root.right==null)
        {
            res.add(s);
        }

        dfs(root.left,res,s);
        dfs(root.right,res,s);

    }
    public int sumNumbers(TreeNode root) {
        ArrayList<String> res=new ArrayList<>();
        String s="";
        dfs(root,res,s);
        int Total=0;
        for(int i=0;i<res.size();i++)
        {
            Total+=Integer.valueOf(res.get(i));
        }

        return Total;
    }
}