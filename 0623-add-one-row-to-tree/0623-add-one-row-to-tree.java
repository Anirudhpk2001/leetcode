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
    public void DFS(TreeNode root, int val,int depth,int pres_depth,boolean flag)
    {
        if(root==null)
        {
            return;
        }
        
        if(pres_depth==depth-2)
        {
            TreeNode temp=new TreeNode(val,null,root.right);
             root.right=temp;  

            temp=new TreeNode(val,root.left,null);
            root.left=temp;

        }
  
        
        pres_depth++;
        DFS(root.left,val,depth,pres_depth,false);
        DFS(root.right,val,depth,pres_depth,true);
    }
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode ans=new TreeNode(val,root,null);
            
            return ans;
        }
        

        DFS(root,val,depth,0,false);
        return root;
    }
}