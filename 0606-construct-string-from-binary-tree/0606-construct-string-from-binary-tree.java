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
    

    public String tree2str(TreeNode root) {
       if(root==null)
       {
        return "";
       }

       String res=""+root.val;

       String Left=tree2str(root.left);
       String Right=tree2str(root.right);

       if(root.left==null && root.right==null)
       {
        return res;
       }

       if(root.left==null)
       {
        return res+"()"+"("+Right+")";
       }
       if(root.right==null)
       {
        return res+"("+Left+")";
       }

        return res+"("+Left+")"+"("+Right+")";
    }
}