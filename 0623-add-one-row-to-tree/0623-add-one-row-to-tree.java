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

    private void dfs(TreeNode root,int val, int depth,int curDepth)
    {
        if(root==null)
        {
            return ;
        }

        if(curDepth == depth-1)
        {
            TreeNode left=root.left;
            TreeNode right=root.right;

            TreeNode nleft=new TreeNode(val);
            TreeNode nright=new TreeNode(val);

            nleft.left=left;
            nright.right=right;

            root.left=nleft;
            root.right=nright;
        }
        else
        {
            dfs(root.left,val,depth,curDepth+1);
            dfs(root.right,val,depth,curDepth+1);
        }


    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1)
        {
            TreeNode one = new TreeNode(val);
            one.left=root;
            one.right=null;
            return one;
        }  
        int curDepth=1;

        dfs(root,val,depth,curDepth);
        
        return root;
    }
}


