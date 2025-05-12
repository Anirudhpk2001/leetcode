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
    StringBuilder result;
    private void dfs(TreeNode root,StringBuilder curr)
    {
        if(root==null)
        {
            return;
        }
         curr.insert(0, (char)(root.val + 'a'));

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            String candidate = curr.toString();
            if (result.length()==0|| candidate.compareTo(result.toString()) < 0) {
                result = new StringBuilder(candidate);
            }
        }

        dfs(root.left, curr);
        dfs(root.right, curr);

        curr.deleteCharAt(0); 

        

    }
    public String smallestFromLeaf(TreeNode root) {
        result=new StringBuilder();

        StringBuilder curr=new StringBuilder();
        dfs(root,curr);
        return result.toString();
    }
}