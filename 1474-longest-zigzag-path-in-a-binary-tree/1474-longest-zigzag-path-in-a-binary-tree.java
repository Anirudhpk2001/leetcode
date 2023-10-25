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
    int maxHeight=0;
    public void MaxDepth(TreeNode root, boolean path, int height)
    {
        if( root==null)
        {
            return ;
        }
        if(path)
        {
            MaxDepth(root.left,false,height+1);
            MaxDepth(root.right,true,1);
        }
        else
        {
            MaxDepth(root.right,true,height+1);
            MaxDepth(root.left,false,1);
        }
        maxHeight=Math.max(maxHeight,height);
    }
    public int longestZigZag(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        MaxDepth(root,true,0);
        MaxDepth(root,false,0);

        return maxHeight;
    }
}