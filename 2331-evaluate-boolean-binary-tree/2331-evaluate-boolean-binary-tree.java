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
    public int calculate(TreeNode root,int res,int res_l,int res_r)
    {
         if(root.val==2)
        {
            res_l=calculate(root.left,res,res_l,res_r);
            res_r=calculate(root.right,res,res_l,res_r);
            res=res_l | res_r;
        }
        else if(root.val==3)
        {
            res_l=calculate(root.left,res,res_l,res_r);
            res_r=calculate(root.right,res,res_l,res_r);
            res=res_l & res_r;
        }
        else if (root.left==null && root.right==null)
        {
            res=root.val;
            return res;
        }
       return res;
    }

    public boolean evaluateTree(TreeNode root) {
        int res=calculate(root,0,0,0);

        if(res==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}