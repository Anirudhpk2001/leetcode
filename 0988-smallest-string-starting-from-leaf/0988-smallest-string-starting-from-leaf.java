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
    
    String final_ans="";
    public void DFS(TreeNode root,String ans)
    {
        if(root==null)
        {
            return;
        }
        ans=(char)(97+root.val)+ans;

        if(root.left==null && root.right==null)
        {   
            if(final_ans.length()==0 || final_ans.compareTo(ans)>0)
            {
                 final_ans=ans; 
            }
          

        }
       
        DFS(root.left,ans);
        DFS(root.right,ans);
        
        
    }
    public String smallestFromLeaf(TreeNode root) {
        String ans="";
        if(root==null)
        {
            return null;
        }
        DFS(root,ans);
        return final_ans;
    }
}